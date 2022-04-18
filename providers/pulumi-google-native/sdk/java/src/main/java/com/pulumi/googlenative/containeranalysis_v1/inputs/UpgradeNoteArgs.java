// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.containeranalysis_v1.inputs.UpgradeDistributionArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.VersionArgs;
import com.pulumi.googlenative.containeranalysis_v1.inputs.WindowsUpdateArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An Upgrade Note represents a potential upgrade of a package to a given version. For each package version combination (i.e. bash 4.0, bash 4.1, bash 4.1.2), there will be an Upgrade Note. For Windows, windows_update field represents the information related to the update.
 * 
 */
public final class UpgradeNoteArgs extends com.pulumi.resources.ResourceArgs {

    public static final UpgradeNoteArgs Empty = new UpgradeNoteArgs();

    /**
     * Metadata about the upgrade for each specific operating system.
     * 
     */
    @Import(name="distributions")
      private final @Nullable Output<List<UpgradeDistributionArgs>> distributions;

    public Output<List<UpgradeDistributionArgs>> distributions() {
        return this.distributions == null ? Codegen.empty() : this.distributions;
    }

    /**
     * Required for non-Windows OS. The package this Upgrade is for.
     * 
     */
    @Import(name="package")
      private final @Nullable Output<String> package_;

    public Output<String> package_() {
        return this.package_ == null ? Codegen.empty() : this.package_;
    }

    /**
     * Required for non-Windows OS. The version of the package in machine + human readable form.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<VersionArgs> version;

    public Output<VersionArgs> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    /**
     * Required for Windows OS. Represents the metadata about the Windows update.
     * 
     */
    @Import(name="windowsUpdate")
      private final @Nullable Output<WindowsUpdateArgs> windowsUpdate;

    public Output<WindowsUpdateArgs> windowsUpdate() {
        return this.windowsUpdate == null ? Codegen.empty() : this.windowsUpdate;
    }

    public UpgradeNoteArgs(
        @Nullable Output<List<UpgradeDistributionArgs>> distributions,
        @Nullable Output<String> package_,
        @Nullable Output<VersionArgs> version,
        @Nullable Output<WindowsUpdateArgs> windowsUpdate) {
        this.distributions = distributions;
        this.package_ = package_;
        this.version = version;
        this.windowsUpdate = windowsUpdate;
    }

    private UpgradeNoteArgs() {
        this.distributions = Codegen.empty();
        this.package_ = Codegen.empty();
        this.version = Codegen.empty();
        this.windowsUpdate = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradeNoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<UpgradeDistributionArgs>> distributions;
        private @Nullable Output<String> package_;
        private @Nullable Output<VersionArgs> version;
        private @Nullable Output<WindowsUpdateArgs> windowsUpdate;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradeNoteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributions = defaults.distributions;
    	      this.package_ = defaults.package_;
    	      this.version = defaults.version;
    	      this.windowsUpdate = defaults.windowsUpdate;
        }

        public Builder distributions(@Nullable Output<List<UpgradeDistributionArgs>> distributions) {
            this.distributions = distributions;
            return this;
        }
        public Builder distributions(@Nullable List<UpgradeDistributionArgs> distributions) {
            this.distributions = Codegen.ofNullable(distributions);
            return this;
        }
        public Builder distributions(UpgradeDistributionArgs... distributions) {
            return distributions(List.of(distributions));
        }
        public Builder package_(@Nullable Output<String> package_) {
            this.package_ = package_;
            return this;
        }
        public Builder package_(@Nullable String package_) {
            this.package_ = Codegen.ofNullable(package_);
            return this;
        }
        public Builder version(@Nullable Output<VersionArgs> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable VersionArgs version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }
        public Builder windowsUpdate(@Nullable Output<WindowsUpdateArgs> windowsUpdate) {
            this.windowsUpdate = windowsUpdate;
            return this;
        }
        public Builder windowsUpdate(@Nullable WindowsUpdateArgs windowsUpdate) {
            this.windowsUpdate = Codegen.ofNullable(windowsUpdate);
            return this;
        }        public UpgradeNoteArgs build() {
            return new UpgradeNoteArgs(distributions, package_, version, windowsUpdate);
        }
    }
}
