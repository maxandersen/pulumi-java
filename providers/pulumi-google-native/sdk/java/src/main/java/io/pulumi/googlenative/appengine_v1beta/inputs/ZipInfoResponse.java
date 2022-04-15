// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * The zip file information for a zip deployment.
 * 
 */
public final class ZipInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ZipInfoResponse Empty = new ZipInfoResponse();

    /**
     * An estimate of the number of files in a zip for a zip deployment. If set, must be greater than or equal to the actual number of files. Used for optimizing performance; if not provided, deployment may be slow.
     * 
     */
    @Import(name="filesCount", required=true)
      private final Integer filesCount;

    public Integer filesCount() {
        return this.filesCount;
    }

    /**
     * URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the form 'http(s)://storage.googleapis.com//'.
     * 
     */
    @Import(name="sourceUrl", required=true)
      private final String sourceUrl;

    public String sourceUrl() {
        return this.sourceUrl;
    }

    public ZipInfoResponse(
        Integer filesCount,
        String sourceUrl) {
        this.filesCount = Objects.requireNonNull(filesCount, "expected parameter 'filesCount' to be non-null");
        this.sourceUrl = Objects.requireNonNull(sourceUrl, "expected parameter 'sourceUrl' to be non-null");
    }

    private ZipInfoResponse() {
        this.filesCount = null;
        this.sourceUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZipInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer filesCount;
        private String sourceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ZipInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filesCount = defaults.filesCount;
    	      this.sourceUrl = defaults.sourceUrl;
        }

        public Builder filesCount(Integer filesCount) {
            this.filesCount = Objects.requireNonNull(filesCount);
            return this;
        }
        public Builder sourceUrl(String sourceUrl) {
            this.sourceUrl = Objects.requireNonNull(sourceUrl);
            return this;
        }        public ZipInfoResponse build() {
            return new ZipInfoResponse(filesCount, sourceUrl);
        }
    }
}
