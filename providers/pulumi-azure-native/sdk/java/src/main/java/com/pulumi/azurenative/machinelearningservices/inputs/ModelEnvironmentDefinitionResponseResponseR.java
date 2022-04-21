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
    private @Nullable List<String> bioConductorPackages;

    public Optional<List<String>> bioConductorPackages() {
        return Optional.ofNullable(this.bioConductorPackages);
    }

    /**
     * The CRAN packages to use.
     * 
     */
    @Import(name="cranPackages")
    private @Nullable List<RCranPackageResponse> cranPackages;

    public Optional<List<RCranPackageResponse>> cranPackages() {
        return Optional.ofNullable(this.cranPackages);
    }

    /**
     * The packages from custom urls.
     * 
     */
    @Import(name="customUrlPackages")
    private @Nullable List<String> customUrlPackages;

    public Optional<List<String>> customUrlPackages() {
        return Optional.ofNullable(this.customUrlPackages);
    }

    /**
     * The packages directly from GitHub.
     * 
     */
    @Import(name="gitHubPackages")
    private @Nullable List<RGitHubPackageResponseResponse> gitHubPackages;

    public Optional<List<RGitHubPackageResponseResponse>> gitHubPackages() {
        return Optional.ofNullable(this.gitHubPackages);
    }

    /**
     * The version of R to be installed
     * 
     */
    @Import(name="rVersion")
    private @Nullable String rVersion;

    public Optional<String> rVersion() {
        return Optional.ofNullable(this.rVersion);
    }

    /**
     * The Rscript path to use if an environment build is not required.
     * The path specified gets used to call the user script.
     * 
     */
    @Import(name="rscriptPath")
    private @Nullable String rscriptPath;

    public Optional<String> rscriptPath() {
        return Optional.ofNullable(this.rscriptPath);
    }

    /**
     * Date of MRAN snapshot to use in YYYY-MM-DD format, e.g. &#34;2019-04-17&#34;
     * 
     */
    @Import(name="snapshotDate")
    private @Nullable String snapshotDate;

    public Optional<String> snapshotDate() {
        return Optional.ofNullable(this.snapshotDate);
    }

    /**
     * Indicates whether the environment is managed by user or by AzureML.
     * 
     */
    @Import(name="userManaged")
    private @Nullable Boolean userManaged;

    public Optional<Boolean> userManaged() {
        return Optional.ofNullable(this.userManaged);
    }

    private ModelEnvironmentDefinitionResponseResponseR() {}

    private ModelEnvironmentDefinitionResponseResponseR(ModelEnvironmentDefinitionResponseResponseR $) {
        this.bioConductorPackages = $.bioConductorPackages;
        this.cranPackages = $.cranPackages;
        this.customUrlPackages = $.customUrlPackages;
        this.gitHubPackages = $.gitHubPackages;
        this.rVersion = $.rVersion;
        this.rscriptPath = $.rscriptPath;
        this.snapshotDate = $.snapshotDate;
        this.userManaged = $.userManaged;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelEnvironmentDefinitionResponseResponseR defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelEnvironmentDefinitionResponseResponseR $;

        public Builder() {
            $ = new ModelEnvironmentDefinitionResponseResponseR();
        }

        public Builder(ModelEnvironmentDefinitionResponseResponseR defaults) {
            $ = new ModelEnvironmentDefinitionResponseResponseR(Objects.requireNonNull(defaults));
        }

        public Builder bioConductorPackages(@Nullable List<String> bioConductorPackages) {
            $.bioConductorPackages = bioConductorPackages;
            return this;
        }

        public Builder bioConductorPackages(String... bioConductorPackages) {
            return bioConductorPackages(List.of(bioConductorPackages));
        }

        public Builder cranPackages(@Nullable List<RCranPackageResponse> cranPackages) {
            $.cranPackages = cranPackages;
            return this;
        }

        public Builder cranPackages(RCranPackageResponse... cranPackages) {
            return cranPackages(List.of(cranPackages));
        }

        public Builder customUrlPackages(@Nullable List<String> customUrlPackages) {
            $.customUrlPackages = customUrlPackages;
            return this;
        }

        public Builder customUrlPackages(String... customUrlPackages) {
            return customUrlPackages(List.of(customUrlPackages));
        }

        public Builder gitHubPackages(@Nullable List<RGitHubPackageResponseResponse> gitHubPackages) {
            $.gitHubPackages = gitHubPackages;
            return this;
        }

        public Builder gitHubPackages(RGitHubPackageResponseResponse... gitHubPackages) {
            return gitHubPackages(List.of(gitHubPackages));
        }

        public Builder rVersion(@Nullable String rVersion) {
            $.rVersion = rVersion;
            return this;
        }

        public Builder rscriptPath(@Nullable String rscriptPath) {
            $.rscriptPath = rscriptPath;
            return this;
        }

        public Builder snapshotDate(@Nullable String snapshotDate) {
            $.snapshotDate = snapshotDate;
            return this;
        }

        public Builder userManaged(@Nullable Boolean userManaged) {
            $.userManaged = userManaged;
            return this;
        }

        public ModelEnvironmentDefinitionResponseResponseR build() {
            return $;
        }
    }

}
