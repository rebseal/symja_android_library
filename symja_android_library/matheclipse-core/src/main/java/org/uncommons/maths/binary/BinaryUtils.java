// ============================================================================
//   Copyright 2006-2012 Daniel W. Dyer
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.
// ============================================================================
package org.uncommons.maths.binary;

/**
 * Utility methods for working with binary and hex data.
 * @author Daniel Dyer
 */
public final class BinaryUtils
{
    // Mask for casting a byte to an int, bit-by-bit (with
    // bitwise AND) with no special consideration for the sign bit.
    private static final int BITWISE_BYTE_TO_INT = 0x000000FF;
    
    private static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7',
                                             '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private BinaryUtils()
    {
        // Prevents instantiation of utility class.
    }


    /**
     * Converts an array of bytes in to a String of hexadecimal characters (0 - F).
     * @param data An array of bytes to convert to a String.
     * @return A hexadecimal String representation of the data.
     */
    public static String convertBytesToHexString(byte[] data)
    {
        StringBuilder buffer = new StringBuilder(data.length * 2);
        for (byte b : data)
        {
            buffer.append(HEX_CHARS[(b >>> 4) & 0x0F]);
            buffer.append(HEX_CHARS[b & 0x0F]);
        }
        return buffer.toString();
    }


    /**
     * Converts a hexadecimal String (such as one generated by the
     * {@link #convertBytesToHexString(byte[])} method) into an array of bytes.
     * @param hex The hexadecimal String to be converted into an array of bytes.
     * @return An array of bytes that.
     */
    public static byte[] convertHexStringToBytes(String hex)
    {
        if (hex.length() % 2 != 0)
        {
            throw new IllegalArgumentException("Hex string must have even number of characters.");
        }
        byte[] seed = new byte[hex.length() / 2];
        for (int i = 0; i < seed.length; i++)
        {
            int index = i * 2;
            seed[i] = (byte) Integer.parseInt(hex.substring(index, index + 2), 16);
        }
        return seed;
    }
    


    /**
     * Take four bytes from the specified position in the specified
     * block and convert them into a 32-bit int, using the big-endian
     * convention.
     * @param bytes The data to read from.
     * @param offset The position to start reading the 4-byte int from.
     * @return The 32-bit integer represented by the four bytes.
     */
    public static int convertBytesToInt(byte[] bytes, int offset)
    {
        return (BITWISE_BYTE_TO_INT & bytes[offset + 3])
                | ((BITWISE_BYTE_TO_INT & bytes[offset + 2]) << 8)
                | ((BITWISE_BYTE_TO_INT & bytes[offset + 1]) << 16)
                | ((BITWISE_BYTE_TO_INT & bytes[offset]) << 24);
    }


    /**
     * Convert an array of bytes into an array of ints.  4 bytes from the
     * input data map to a single int in the output data.
     * @param bytes The data to read from.
     * @return An array of 32-bit integers constructed from the data.
     * @since 1.1
     */
    public static int[] convertBytesToInts(byte[] bytes)
    {
        if (bytes.length % 4 != 0)
        {
            throw new IllegalArgumentException("Number of input bytes must be a multiple of 4.");
        }
        int[] ints = new int[bytes.length / 4];
        for (int i = 0; i < ints.length; i++)
        {
            ints[i] = convertBytesToInt(bytes, i * 4);
        }
        return ints;
    }


    /**
     * Utility method to convert an array of bytes into a long.  Byte ordered is
     * assumed to be big-endian.
     * @param bytes The data to read from.
     * @param offset The position to start reading the 8-byte long from.
     * @return The 64-bit integer represented by the eight bytes.
     * @since 1.1
     */
    public static long convertBytesToLong(byte[] bytes, int offset)
    {
        long value = 0;
        for (int i = offset; i < offset + 8; i++)
        {
            byte b = bytes[i];
            value <<= 8;
            value |= b;
        }
        return value;

    }


    /**
     * Converts a floating point value in the range 0 - 1 into a fixed
     * point bit string (where the most significant bit has a value of 0.5).
     * @param value The value to convert (must be between zero and one).
     * @return A bit string representing the value in fixed-point format.
     */
    public static BitString convertDoubleToFixedPointBits(double value)
    {
        if (value < 0.0d || value >= 1.0d)
        {
            throw new IllegalArgumentException("Value must be between 0 and 1.");
        }
        StringBuilder bits = new StringBuilder(64);
        double bitValue = 0.5d;
        double d = value;
        while (d > 0)
        {
            if (d >= bitValue)
            {
                bits.append('1');
                d -= bitValue;
            }
            else
            {
                bits.append('0');
            }
            bitValue /= 2;
        }
        return new BitString(bits.toString());
    }
}
