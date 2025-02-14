// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2CloudStoragePathResponse;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2WordListResponse;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2DictionaryResponse {
    /**
     * @return Newline-delimited file of words in Cloud Storage. Only a single file is accepted.
     * 
     */
    private final GooglePrivacyDlpV2CloudStoragePathResponse cloudStoragePath;
    /**
     * @return List of words or phrases to search for.
     * 
     */
    private final GooglePrivacyDlpV2WordListResponse wordList;

    @CustomType.Constructor
    private GooglePrivacyDlpV2DictionaryResponse(
        @CustomType.Parameter("cloudStoragePath") GooglePrivacyDlpV2CloudStoragePathResponse cloudStoragePath,
        @CustomType.Parameter("wordList") GooglePrivacyDlpV2WordListResponse wordList) {
        this.cloudStoragePath = cloudStoragePath;
        this.wordList = wordList;
    }

    /**
     * @return Newline-delimited file of words in Cloud Storage. Only a single file is accepted.
     * 
     */
    public GooglePrivacyDlpV2CloudStoragePathResponse cloudStoragePath() {
        return this.cloudStoragePath;
    }
    /**
     * @return List of words or phrases to search for.
     * 
     */
    public GooglePrivacyDlpV2WordListResponse wordList() {
        return this.wordList;
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
