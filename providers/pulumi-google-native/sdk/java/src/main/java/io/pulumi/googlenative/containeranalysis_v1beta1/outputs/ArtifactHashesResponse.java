// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ArtifactHashesResponse {
    private final String sha256;

    @OutputCustomType.Constructor
    private ArtifactHashesResponse(@OutputCustomType.Parameter("sha256") String sha256) {
        this.sha256 = sha256;
    }

    public String getSha256() {
        return this.sha256;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArtifactHashesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sha256;

        public Builder() {
    	      // Empty
        }

        public Builder(ArtifactHashesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sha256 = defaults.sha256;
        }

        public Builder setSha256(String sha256) {
            this.sha256 = Objects.requireNonNull(sha256);
            return this;
        }
        public ArtifactHashesResponse build() {
            return new ArtifactHashesResponse(sha256);
        }
    }
}
