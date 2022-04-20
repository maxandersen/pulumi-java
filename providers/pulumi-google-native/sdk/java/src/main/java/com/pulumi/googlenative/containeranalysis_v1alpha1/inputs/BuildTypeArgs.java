// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.BuildSignatureArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Note holding the version of the provider&#39;s builder and the signature of the provenance message in linked BuildDetails.
 * 
 */
public final class BuildTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final BuildTypeArgs Empty = new BuildTypeArgs();

    /**
     * Version of the builder which produced this Note.
     * 
     */
    @Import(name="builderVersion")
      private final @Nullable Output<String> builderVersion;

    public Output<String> builderVersion() {
        return this.builderVersion == null ? Codegen.empty() : this.builderVersion;
    }

    /**
     * Signature of the build in Occurrences pointing to the Note containing this `BuilderDetails`.
     * 
     */
    @Import(name="signature")
      private final @Nullable Output<BuildSignatureArgs> signature;

    public Output<BuildSignatureArgs> signature() {
        return this.signature == null ? Codegen.empty() : this.signature;
    }

    public BuildTypeArgs(
        @Nullable Output<String> builderVersion,
        @Nullable Output<BuildSignatureArgs> signature) {
        this.builderVersion = builderVersion;
        this.signature = signature;
    }

    private BuildTypeArgs() {
        this.builderVersion = Codegen.empty();
        this.signature = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> builderVersion;
        private @Nullable Output<BuildSignatureArgs> signature;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.builderVersion = defaults.builderVersion;
    	      this.signature = defaults.signature;
        }

        public Builder builderVersion(@Nullable Output<String> builderVersion) {
            this.builderVersion = builderVersion;
            return this;
        }
        public Builder builderVersion(@Nullable String builderVersion) {
            this.builderVersion = Codegen.ofNullable(builderVersion);
            return this;
        }
        public Builder signature(@Nullable Output<BuildSignatureArgs> signature) {
            this.signature = signature;
            return this;
        }
        public Builder signature(@Nullable BuildSignatureArgs signature) {
            this.signature = Codegen.ofNullable(signature);
            return this;
        }        public BuildTypeArgs build() {
            return new BuildTypeArgs(builderVersion, signature);
        }
    }
}
