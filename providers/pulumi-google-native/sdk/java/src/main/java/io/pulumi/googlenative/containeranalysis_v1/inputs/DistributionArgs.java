// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.containeranalysis_v1.enums.DistributionArchitecture;
import io.pulumi.googlenative.containeranalysis_v1.inputs.VersionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This represents a particular channel of distribution for a given package. E.g., Debian's jessie-backports dpkg mirror.
 * 
 */
public final class DistributionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionArgs Empty = new DistributionArgs();

    /**
     * The CPU architecture for which packages in this distribution channel were built.
     * 
     */
    @Import(name="architecture")
      private final @Nullable Output<DistributionArchitecture> architecture;

    public Output<DistributionArchitecture> architecture() {
        return this.architecture == null ? Codegen.empty() : this.architecture;
    }

    /**
     * The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager version distributing a package.
     * 
     */
    @Import(name="cpeUri", required=true)
      private final Output<String> cpeUri;

    public Output<String> cpeUri() {
        return this.cpeUri;
    }

    /**
     * The distribution channel-specific description of this package.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The latest available version of this package in this distribution channel.
     * 
     */
    @Import(name="latestVersion")
      private final @Nullable Output<VersionArgs> latestVersion;

    public Output<VersionArgs> latestVersion() {
        return this.latestVersion == null ? Codegen.empty() : this.latestVersion;
    }

    /**
     * A freeform string denoting the maintainer of this package.
     * 
     */
    @Import(name="maintainer")
      private final @Nullable Output<String> maintainer;

    public Output<String> maintainer() {
        return this.maintainer == null ? Codegen.empty() : this.maintainer;
    }

    /**
     * The distribution channel-specific homepage for this package.
     * 
     */
    @Import(name="url")
      private final @Nullable Output<String> url;

    public Output<String> url() {
        return this.url == null ? Codegen.empty() : this.url;
    }

    public DistributionArgs(
        @Nullable Output<DistributionArchitecture> architecture,
        Output<String> cpeUri,
        @Nullable Output<String> description,
        @Nullable Output<VersionArgs> latestVersion,
        @Nullable Output<String> maintainer,
        @Nullable Output<String> url) {
        this.architecture = architecture;
        this.cpeUri = Objects.requireNonNull(cpeUri, "expected parameter 'cpeUri' to be non-null");
        this.description = description;
        this.latestVersion = latestVersion;
        this.maintainer = maintainer;
        this.url = url;
    }

    private DistributionArgs() {
        this.architecture = Codegen.empty();
        this.cpeUri = Codegen.empty();
        this.description = Codegen.empty();
        this.latestVersion = Codegen.empty();
        this.maintainer = Codegen.empty();
        this.url = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DistributionArchitecture> architecture;
        private Output<String> cpeUri;
        private @Nullable Output<String> description;
        private @Nullable Output<VersionArgs> latestVersion;
        private @Nullable Output<String> maintainer;
        private @Nullable Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.cpeUri = defaults.cpeUri;
    	      this.description = defaults.description;
    	      this.latestVersion = defaults.latestVersion;
    	      this.maintainer = defaults.maintainer;
    	      this.url = defaults.url;
        }

        public Builder architecture(@Nullable Output<DistributionArchitecture> architecture) {
            this.architecture = architecture;
            return this;
        }
        public Builder architecture(@Nullable DistributionArchitecture architecture) {
            this.architecture = Codegen.ofNullable(architecture);
            return this;
        }
        public Builder cpeUri(Output<String> cpeUri) {
            this.cpeUri = Objects.requireNonNull(cpeUri);
            return this;
        }
        public Builder cpeUri(String cpeUri) {
            this.cpeUri = Output.of(Objects.requireNonNull(cpeUri));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder latestVersion(@Nullable Output<VersionArgs> latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public Builder latestVersion(@Nullable VersionArgs latestVersion) {
            this.latestVersion = Codegen.ofNullable(latestVersion);
            return this;
        }
        public Builder maintainer(@Nullable Output<String> maintainer) {
            this.maintainer = maintainer;
            return this;
        }
        public Builder maintainer(@Nullable String maintainer) {
            this.maintainer = Codegen.ofNullable(maintainer);
            return this;
        }
        public Builder url(@Nullable Output<String> url) {
            this.url = url;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = Codegen.ofNullable(url);
            return this;
        }        public DistributionArgs build() {
            return new DistributionArgs(architecture, cpeUri, description, latestVersion, maintainer, url);
        }
    }
}
