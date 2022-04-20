// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.RCranPackageResponse;
import com.pulumi.azurenative.machinelearningservices.inputs.RGitHubPackageResponseResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings for a R environment.
 * 
 */
public final class ModelEnvironmentDefinitionResponseResponseR extends com.pulumi.resources.InvokeArgs {

    public static final ModelEnvironmentDefinitionResponseResponseR Empty = new ModelEnvironmentDefinitionResponseResponseR();

    /**
     * The packages from Bioconductor.
     * 
     */
    @Import(name="bioConductorPackages")
      private final @Nullable List<String> bioConductorPackages;

    public List<String> bioConductorPackages() {
        return this.bioConductorPackages == null ? List.of() : this.bioConductorPackages;
    }

    /**
     * The CRAN packages to use.
     * 
     */
    @Import(name="cranPackages")
      private final @Nullable List<RCranPackageResponse> cranPackages;

    public List<RCranPackageResponse> cranPackages() {
        return this.cranPackages == null ? List.of() : this.cranPackages;
    }

    /**
     * The packages from custom urls.
     * 
     */
    @Import(name="customUrlPackages")
      private final @Nullable List<String> customUrlPackages;

    public List<String> customUrlPackages() {
        return this.customUrlPackages == null ? List.of() : this.customUrlPackages;
    }

    /**
     * The packages directly from GitHub.
     * 
     */
    @Import(name="gitHubPackages")
      private final @Nullable List<RGitHubPackageResponseResponse> gitHubPackages;

    public List<RGitHubPackageResponseResponse> gitHubPackages() {
        return this.gitHubPackages == null ? List.of() : this.gitHubPackages;
    }

    /**
     * The version of R to be installed
     * 
     */
    @Import(name="rVersion")
      private final @Nullable String rVersion;

    public Optional<String> rVersion() {
        return this.rVersion == null ? Optional.empty() : Optional.ofNullable(this.rVersion);
    }

    /**
     * The Rscript path to use if an environment build is not required.
     * The path specified gets used to call the user script.
     * 
     */
    @Import(name="rscriptPath")
      private final @Nullable String rscriptPath;

    public Optional<String> rscriptPath() {
        return this.rscriptPath == null ? Optional.empty() : Optional.ofNullable(this.rscriptPath);
    }

    /**
     * Date of MRAN snapshot to use in YYYY-MM-DD format, e.g. &#34;2019-04-17&#34;
     * 
     */
    @Import(name="snapshotDate")
      private final @Nullable String snapshotDate;

    public Optional<String> snapshotDate() {
        return this.snapshotDate == null ? Optional.empty() : Optional.ofNullable(this.snapshotDate);
    }

    /**
     * Indicates whether the environment is managed by user or by AzureML.
     * 
     */
    @Import(name="userManaged")
      private final @Nullable Boolean userManaged;

    public Optional<Boolean> userManaged() {
        return this.userManaged == null ? Optional.empty() : Optional.ofNullable(this.userManaged);
    }

    public ModelEnvironmentDefinitionResponseResponseR(
        @Nullable List<String> bioConductorPackages,
        @Nullable List<RCranPackageResponse> cranPackages,
        @Nullable List<String> customUrlPackages,
        @Nullable List<RGitHubPackageResponseResponse> gitHubPackages,
        @Nullable String rVersion,
        @Nullable String rscriptPath,
        @Nullable String snapshotDate,
        @Nullable Boolean userManaged) {
        this.bioConductorPackages = bioConductorPackages;
        this.cranPackages = cranPackages;
        this.customUrlPackages = customUrlPackages;
        this.gitHubPackages = gitHubPackages;
        this.rVersion = rVersion;
        this.rscriptPath = rscriptPath;
        this.snapshotDate = snapshotDate;
        this.userManaged = userManaged;
    }

    private ModelEnvironmentDefinitionResponseResponseR() {
        this.bioConductorPackages = List.of();
        this.cranPackages = List.of();
        this.customUrlPackages = List.of();
        this.gitHubPackages = List.of();
        this.rVersion = null;
        this.rscriptPath = null;
        this.snapshotDate = null;
        this.userManaged = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelEnvironmentDefinitionResponseResponseR defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> bioConductorPackages;
        private @Nullable List<RCranPackageResponse> cranPackages;
        private @Nullable List<String> customUrlPackages;
        private @Nullable List<RGitHubPackageResponseResponse> gitHubPackages;
        private @Nullable String rVersion;
        private @Nullable String rscriptPath;
        private @Nullable String snapshotDate;
        private @Nullable Boolean userManaged;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelEnvironmentDefinitionResponseResponseR defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bioConductorPackages = defaults.bioConductorPackages;
    	      this.cranPackages = defaults.cranPackages;
    	      this.customUrlPackages = defaults.customUrlPackages;
    	      this.gitHubPackages = defaults.gitHubPackages;
    	      this.rVersion = defaults.rVersion;
    	      this.rscriptPath = defaults.rscriptPath;
    	      this.snapshotDate = defaults.snapshotDate;
    	      this.userManaged = defaults.userManaged;
        }

        public Builder bioConductorPackages(@Nullable List<String> bioConductorPackages) {
            this.bioConductorPackages = bioConductorPackages;
            return this;
        }
        public Builder bioConductorPackages(String... bioConductorPackages) {
            return bioConductorPackages(List.of(bioConductorPackages));
        }
        public Builder cranPackages(@Nullable List<RCranPackageResponse> cranPackages) {
            this.cranPackages = cranPackages;
            return this;
        }
        public Builder cranPackages(RCranPackageResponse... cranPackages) {
            return cranPackages(List.of(cranPackages));
        }
        public Builder customUrlPackages(@Nullable List<String> customUrlPackages) {
            this.customUrlPackages = customUrlPackages;
            return this;
        }
        public Builder customUrlPackages(String... customUrlPackages) {
            return customUrlPackages(List.of(customUrlPackages));
        }
        public Builder gitHubPackages(@Nullable List<RGitHubPackageResponseResponse> gitHubPackages) {
            this.gitHubPackages = gitHubPackages;
            return this;
        }
        public Builder gitHubPackages(RGitHubPackageResponseResponse... gitHubPackages) {
            return gitHubPackages(List.of(gitHubPackages));
        }
        public Builder rVersion(@Nullable String rVersion) {
            this.rVersion = rVersion;
            return this;
        }
        public Builder rscriptPath(@Nullable String rscriptPath) {
            this.rscriptPath = rscriptPath;
            return this;
        }
        public Builder snapshotDate(@Nullable String snapshotDate) {
            this.snapshotDate = snapshotDate;
            return this;
        }
        public Builder userManaged(@Nullable Boolean userManaged) {
            this.userManaged = userManaged;
            return this;
        }        public ModelEnvironmentDefinitionResponseResponseR build() {
            return new ModelEnvironmentDefinitionResponseResponseR(bioConductorPackages, cranPackages, customUrlPackages, gitHubPackages, rVersion, rscriptPath, snapshotDate, userManaged);
        }
    }
}
