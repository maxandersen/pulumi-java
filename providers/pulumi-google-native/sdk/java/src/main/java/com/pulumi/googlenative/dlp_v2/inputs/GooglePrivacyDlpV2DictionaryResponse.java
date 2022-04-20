// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CloudStoragePathResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2WordListResponse;
import java.util.Objects;


/**
 * Custom information type based on a dictionary of words or phrases. This can be used to match sensitive information specific to the data, such as a list of employee IDs or job titles. Dictionary words are case-insensitive and all characters other than letters and digits in the unicode [Basic Multilingual Plane](https://en.wikipedia.org/wiki/Plane_%28Unicode%29#Basic_Multilingual_Plane) will be replaced with whitespace when scanning for matches, so the dictionary phrase &#34;Sam Johnson&#34; will match all three phrases &#34;sam johnson&#34;, &#34;Sam, Johnson&#34;, and &#34;Sam (Johnson)&#34;. Additionally, the characters surrounding any match must be of a different type than the adjacent characters within the word, so letters must be next to non-letters and digits next to non-digits. For example, the dictionary word &#34;jen&#34; will match the first three letters of the text &#34;jen123&#34; but will return no matches for &#34;jennifer&#34;. Dictionary words containing a large number of characters that are not letters or digits may result in unexpected findings because such characters are treated as whitespace. The [limits](https://cloud.google.com/dlp/limits) page contains details about the size limits of dictionaries. For dictionaries that do not fit within these constraints, consider using `LargeCustomDictionaryConfig` in the `StoredInfoType` API.
 * 
 */
public final class GooglePrivacyDlpV2DictionaryResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2DictionaryResponse Empty = new GooglePrivacyDlpV2DictionaryResponse();

    /**
     * Newline-delimited file of words in Cloud Storage. Only a single file is accepted.
     * 
     */
    @Import(name="cloudStoragePath", required=true)
      private final GooglePrivacyDlpV2CloudStoragePathResponse cloudStoragePath;

    public GooglePrivacyDlpV2CloudStoragePathResponse cloudStoragePath() {
        return this.cloudStoragePath;
    }

    /**
     * List of words or phrases to search for.
     * 
     */
    @Import(name="wordList", required=true)
      private final GooglePrivacyDlpV2WordListResponse wordList;

    public GooglePrivacyDlpV2WordListResponse wordList() {
        return this.wordList;
    }

    public GooglePrivacyDlpV2DictionaryResponse(
        GooglePrivacyDlpV2CloudStoragePathResponse cloudStoragePath,
        GooglePrivacyDlpV2WordListResponse wordList) {
        this.cloudStoragePath = Objects.requireNonNull(cloudStoragePath, "expected parameter 'cloudStoragePath' to be non-null");
        this.wordList = Objects.requireNonNull(wordList, "expected parameter 'wordList' to be non-null");
    }

    private GooglePrivacyDlpV2DictionaryResponse() {
        this.cloudStoragePath = null;
        this.wordList = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2DictionaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2CloudStoragePathResponse cloudStoragePath;
        private GooglePrivacyDlpV2WordListResponse wordList;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2DictionaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudStoragePath = defaults.cloudStoragePath;
    	      this.wordList = defaults.wordList;
        }

        public Builder cloudStoragePath(GooglePrivacyDlpV2CloudStoragePathResponse cloudStoragePath) {
            this.cloudStoragePath = Objects.requireNonNull(cloudStoragePath);
            return this;
        }
        public Builder wordList(GooglePrivacyDlpV2WordListResponse wordList) {
            this.wordList = Objects.requireNonNull(wordList);
            return this;
        }        public GooglePrivacyDlpV2DictionaryResponse build() {
            return new GooglePrivacyDlpV2DictionaryResponse(cloudStoragePath, wordList);
        }
    }
}
