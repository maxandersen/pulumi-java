// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Location of output file(s) in a Cloud Storage bucket.
 * 
 */
public final class OutputResponse extends com.pulumi.resources.InvokeArgs {

    public static final OutputResponse Empty = new OutputResponse();

    /**
     * URI for the output file(s). For example, `gs://my-bucket/outputs/`. If empty the value is populated from `Job.output_uri`.
     * 
     */
    @Import(name="uri", required=true)
      private final String uri;

    public String uri() {
        return this.uri;
    }

    public OutputResponse(String uri) {
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private OutputResponse() {
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(OutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uri = defaults.uri;
        }

        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public OutputResponse build() {
            return new OutputResponse(uri);
        }
    }
}
