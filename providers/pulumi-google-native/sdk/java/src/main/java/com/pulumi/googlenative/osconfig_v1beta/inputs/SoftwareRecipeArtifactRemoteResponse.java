// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies an artifact available via some URI.
 * 
 */
public final class SoftwareRecipeArtifactRemoteResponse extends com.pulumi.resources.InvokeArgs {

    public static final SoftwareRecipeArtifactRemoteResponse Empty = new SoftwareRecipeArtifactRemoteResponse();

    /**
     * Must be provided if `allow_insecure` is `false`. SHA256 checksum in hex format, to compare to the checksum of the artifact. If the checksum is not empty and it doesn't match the artifact then the recipe installation fails before running any of the steps.
     * 
     */
    @Import(name="checksum", required=true)
      private final String checksum;

    public String checksum() {
        return this.checksum;
    }

    /**
     * URI from which to fetch the object. It should contain both the protocol and path following the format {protocol}://{location}.
     * 
     */
    @Import(name="uri", required=true)
      private final String uri;

    public String uri() {
        return this.uri;
    }

    public SoftwareRecipeArtifactRemoteResponse(
        String checksum,
        String uri) {
        this.checksum = Objects.requireNonNull(checksum, "expected parameter 'checksum' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private SoftwareRecipeArtifactRemoteResponse() {
        this.checksum = null;
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeArtifactRemoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String checksum;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeArtifactRemoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checksum = defaults.checksum;
    	      this.uri = defaults.uri;
        }

        public Builder checksum(String checksum) {
            this.checksum = Objects.requireNonNull(checksum);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public SoftwareRecipeArtifactRemoteResponse build() {
            return new SoftwareRecipeArtifactRemoteResponse(checksum, uri);
        }
    }
}
