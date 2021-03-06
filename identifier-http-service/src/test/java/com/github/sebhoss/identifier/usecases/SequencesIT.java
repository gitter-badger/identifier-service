/*
 * This is free and unencumbered software released into the public domain.
 *
 * Anyone is free to copy, modify, publish, use, compile, sell, or
 * distribute this software, either in source code form or as a compiled
 * binary, for any purpose, commercial or non-commercial, and by any
 * means.
 *
 * In jurisdictions that recognize copyright laws, the author or authors
 * of this software dedicate any and all copyright interest in the
 * software to the public domain. We make this dedication for the benefit
 * of the public at large and to the detriment of our heirs and
 * successors. We intend this dedication to be an overt act of
 * relinquishment in perpetuity of all present and future rights to this
 * software under copyright law.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 * For more information, please refer to <http://unlicense.org>
 */
package com.github.sebhoss.identifier.usecases;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import com.github.sebhoss.identifier.testsupport.AbstractIntegrationTest;

import org.junit.Test;
import org.springframework.http.ResponseEntity;

/**
 * Integration test for {@link Sequences}.
 */
@SuppressWarnings("nls")
public class SequencesIT extends AbstractIntegrationTest {

    /**
     * Ensures that a sequence number can be retrieved from <code>/sequences/sequence</code>.
     *
     * @throws Exception
     *             In case something goes wrong.
     */
    @Test
    public void shouldGetSequence() throws Exception {
        final ResponseEntity<String> response = fetchString("/sequences/sequence");
        assertThat(response.getBody(), equalTo("0"));
    }

    /**
     * Ensures that a sequence number in Base36 can be retrieved from <code>/sequences/base36</code>.
     *
     * @throws Exception
     *             In case something goes wrong.
     */
    @Test
    public void shouldGetSequenceInBase36() throws Exception {
        final ResponseEntity<String> response = fetchString("/sequences/base36");
        assertThat(response.getBody(), equalTo("2"));
    }

    /**
     * Ensures that a sequence number in Base62 can be retrieved from <code>/sequences/base62</code>.
     *
     * @throws Exception
     *             In case something goes wrong.
     */
    @Test
    public void shouldGetSequenceInBase62() throws Exception {
        final ResponseEntity<String> response = fetchString("/sequences/base62");
        assertThat(response.getBody(), equalTo("d"));
    }

    /**
     * Ensures that a sequence number in Base64 can be retrieved from <code>/sequences/base64</code>.
     *
     * @throws Exception
     *             In case something goes wrong.
     */
    @Test
    public void shouldGetSequenceInBase64() throws Exception {
        final ResponseEntity<String> response = fetchString("/sequences/base64");
        assertThat(response.getBody(), equalTo("NA"));
    }

    /**
     * Ensures that a sequence number as HashId can be retrieved from <code>/sequences/hashid</code>.
     *
     * @throws Exception
     *             In case something goes wrong.
     */
    @Test
    public void shouldGetSequenceAsHashId() throws Exception {
        final ResponseEntity<String> response = fetchString("/sequences/hashid");
        assertThat(response.getBody(), equalTo("lQ"));
    }

}
