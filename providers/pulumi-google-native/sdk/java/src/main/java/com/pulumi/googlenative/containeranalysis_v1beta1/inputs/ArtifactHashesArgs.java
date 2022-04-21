// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a hash object for use in Materials and Products.
 * 
 */
public final class ArtifactHashesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ArtifactHashesArgs Empty = new ArtifactHashesArgs();

    @Import(name="sha256")
    private @Nullable Output<String> sha256;

    public Optional<Output<String>> sha256() {
        return Optional.ofNullable(this.sha256);
    }

    private ArtifactHashesArgs() {}

    private ArtifactHashesArgs(ArtifactHashesArgs $) {
        this.sha256 = $.sha256;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ArtifactHashesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ArtifactHashesArgs $;

        public Builder() {
            $ = new ArtifactHashesArgs();
        }

        public Builder(ArtifactHashesArgs defaults) {
            $ = new ArtifactHashesArgs(Objects.requireNonNull(defaults));
        }

        public Builder sha256(@Nullable Output<String> sha256) {
            $.sha256 = sha256;
            return this;
        }

        public Builder sha256(String sha256) {
            return sha256(Output.of(sha256));
        }

        public ArtifactHashesArgs build() {
            return $;
        }
    }

}
