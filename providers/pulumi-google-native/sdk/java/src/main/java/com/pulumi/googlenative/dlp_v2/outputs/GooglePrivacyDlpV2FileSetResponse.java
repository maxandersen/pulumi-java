// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2CloudStorageRegexFileSetResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2FileSetResponse {
    /**
     * The regex-filtered set of files to scan. Exactly one of `url` or `regex_file_set` must be set.
     * 
     */
    private final GooglePrivacyDlpV2CloudStorageRegexFileSetResponse regexFileSet;
    /**
     * The Cloud Storage url of the file(s) to scan, in the format `gs:///`. Trailing wildcard in the path is allowed. If the url ends in a trailing slash, the bucket or directory represented by the url will be scanned non-recursively (content in sub-directories will not be scanned). This means that `gs://mybucket/` is equivalent to `gs://mybucket/*`, and `gs://mybucket/directory/` is equivalent to `gs://mybucket/directory/*`. Exactly one of `url` or `regex_file_set` must be set.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private GooglePrivacyDlpV2FileSetResponse(
        @CustomType.Parameter("regexFileSet") GooglePrivacyDlpV2CloudStorageRegexFileSetResponse regexFileSet,
        @CustomType.Parameter("url") String url) {
        this.regexFileSet = regexFileSet;
        this.url = url;
    }

    /**
     * The regex-filtered set of files to scan. Exactly one of `url` or `regex_file_set` must be set.
     * 
    */
    public GooglePrivacyDlpV2CloudStorageRegexFileSetResponse regexFileSet() {
        return this.regexFileSet;
    }
    /**
     * The Cloud Storage url of the file(s) to scan, in the format `gs:///`. Trailing wildcard in the path is allowed. If the url ends in a trailing slash, the bucket or directory represented by the url will be scanned non-recursively (content in sub-directories will not be scanned). This means that `gs://mybucket/` is equivalent to `gs://mybucket/*`, and `gs://mybucket/directory/` is equivalent to `gs://mybucket/directory/*`. Exactly one of `url` or `regex_file_set` must be set.
     * 
    */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2FileSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2CloudStorageRegexFileSetResponse regexFileSet;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2FileSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regexFileSet = defaults.regexFileSet;
    	      this.url = defaults.url;
        }

        public Builder regexFileSet(GooglePrivacyDlpV2CloudStorageRegexFileSetResponse regexFileSet) {
            this.regexFileSet = Objects.requireNonNull(regexFileSet);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public GooglePrivacyDlpV2FileSetResponse build() {
            return new GooglePrivacyDlpV2FileSetResponse(regexFileSet, url);
        }
    }
}
