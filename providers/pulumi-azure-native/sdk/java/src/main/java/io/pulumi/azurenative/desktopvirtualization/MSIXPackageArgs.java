// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization;

import io.pulumi.azurenative.desktopvirtualization.inputs.MsixPackageApplicationsArgs;
import io.pulumi.azurenative.desktopvirtualization.inputs.MsixPackageDependenciesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MSIXPackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final MSIXPackageArgs Empty = new MSIXPackageArgs();

    /**
     * User friendly Name to be displayed in the portal.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The name of the host pool within the specified resource group
     * 
     */
    @Import(name="hostPoolName", required=true)
      private final Output<String> hostPoolName;

    public Output<String> hostPoolName() {
        return this.hostPoolName;
    }

    /**
     * VHD/CIM image path on Network Share.
     * 
     */
    @Import(name="imagePath")
      private final @Nullable Output<String> imagePath;

    public Output<String> imagePath() {
        return this.imagePath == null ? Codegen.empty() : this.imagePath;
    }

    /**
     * Make this version of the package the active one across the hostpool.
     * 
     */
    @Import(name="isActive")
      private final @Nullable Output<Boolean> isActive;

    public Output<Boolean> isActive() {
        return this.isActive == null ? Codegen.empty() : this.isActive;
    }

    /**
     * Specifies how to register Package in feed.
     * 
     */
    @Import(name="isRegularRegistration")
      private final @Nullable Output<Boolean> isRegularRegistration;

    public Output<Boolean> isRegularRegistration() {
        return this.isRegularRegistration == null ? Codegen.empty() : this.isRegularRegistration;
    }

    /**
     * Date Package was last updated, found in the appxmanifest.xml.
     * 
     */
    @Import(name="lastUpdated")
      private final @Nullable Output<String> lastUpdated;

    public Output<String> lastUpdated() {
        return this.lastUpdated == null ? Codegen.empty() : this.lastUpdated;
    }

    /**
     * The version specific package full name of the MSIX package within specified hostpool
     * 
     */
    @Import(name="msixPackageFullName")
      private final @Nullable Output<String> msixPackageFullName;

    public Output<String> msixPackageFullName() {
        return this.msixPackageFullName == null ? Codegen.empty() : this.msixPackageFullName;
    }

    /**
     * List of package applications.
     * 
     */
    @Import(name="packageApplications")
      private final @Nullable Output<List<MsixPackageApplicationsArgs>> packageApplications;

    public Output<List<MsixPackageApplicationsArgs>> packageApplications() {
        return this.packageApplications == null ? Codegen.empty() : this.packageApplications;
    }

    /**
     * List of package dependencies.
     * 
     */
    @Import(name="packageDependencies")
      private final @Nullable Output<List<MsixPackageDependenciesArgs>> packageDependencies;

    public Output<List<MsixPackageDependenciesArgs>> packageDependencies() {
        return this.packageDependencies == null ? Codegen.empty() : this.packageDependencies;
    }

    /**
     * Package Family Name from appxmanifest.xml. Contains Package Name and Publisher name.
     * 
     */
    @Import(name="packageFamilyName")
      private final @Nullable Output<String> packageFamilyName;

    public Output<String> packageFamilyName() {
        return this.packageFamilyName == null ? Codegen.empty() : this.packageFamilyName;
    }

    /**
     * Package Name from appxmanifest.xml.
     * 
     */
    @Import(name="packageName")
      private final @Nullable Output<String> packageName;

    public Output<String> packageName() {
        return this.packageName == null ? Codegen.empty() : this.packageName;
    }

    /**
     * Relative Path to the package inside the image.
     * 
     */
    @Import(name="packageRelativePath")
      private final @Nullable Output<String> packageRelativePath;

    public Output<String> packageRelativePath() {
        return this.packageRelativePath == null ? Codegen.empty() : this.packageRelativePath;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Package Version found in the appxmanifest.xml.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public MSIXPackageArgs(
        @Nullable Output<String> displayName,
        Output<String> hostPoolName,
        @Nullable Output<String> imagePath,
        @Nullable Output<Boolean> isActive,
        @Nullable Output<Boolean> isRegularRegistration,
        @Nullable Output<String> lastUpdated,
        @Nullable Output<String> msixPackageFullName,
        @Nullable Output<List<MsixPackageApplicationsArgs>> packageApplications,
        @Nullable Output<List<MsixPackageDependenciesArgs>> packageDependencies,
        @Nullable Output<String> packageFamilyName,
        @Nullable Output<String> packageName,
        @Nullable Output<String> packageRelativePath,
        Output<String> resourceGroupName,
        @Nullable Output<String> version) {
        this.displayName = displayName;
        this.hostPoolName = Objects.requireNonNull(hostPoolName, "expected parameter 'hostPoolName' to be non-null");
        this.imagePath = imagePath;
        this.isActive = isActive;
        this.isRegularRegistration = isRegularRegistration;
        this.lastUpdated = lastUpdated;
        this.msixPackageFullName = msixPackageFullName;
        this.packageApplications = packageApplications;
        this.packageDependencies = packageDependencies;
        this.packageFamilyName = packageFamilyName;
        this.packageName = packageName;
        this.packageRelativePath = packageRelativePath;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.version = version;
    }

    private MSIXPackageArgs() {
        this.displayName = Codegen.empty();
        this.hostPoolName = Codegen.empty();
        this.imagePath = Codegen.empty();
        this.isActive = Codegen.empty();
        this.isRegularRegistration = Codegen.empty();
        this.lastUpdated = Codegen.empty();
        this.msixPackageFullName = Codegen.empty();
        this.packageApplications = Codegen.empty();
        this.packageDependencies = Codegen.empty();
        this.packageFamilyName = Codegen.empty();
        this.packageName = Codegen.empty();
        this.packageRelativePath = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MSIXPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayName;
        private Output<String> hostPoolName;
        private @Nullable Output<String> imagePath;
        private @Nullable Output<Boolean> isActive;
        private @Nullable Output<Boolean> isRegularRegistration;
        private @Nullable Output<String> lastUpdated;
        private @Nullable Output<String> msixPackageFullName;
        private @Nullable Output<List<MsixPackageApplicationsArgs>> packageApplications;
        private @Nullable Output<List<MsixPackageDependenciesArgs>> packageDependencies;
        private @Nullable Output<String> packageFamilyName;
        private @Nullable Output<String> packageName;
        private @Nullable Output<String> packageRelativePath;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(MSIXPackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.hostPoolName = defaults.hostPoolName;
    	      this.imagePath = defaults.imagePath;
    	      this.isActive = defaults.isActive;
    	      this.isRegularRegistration = defaults.isRegularRegistration;
    	      this.lastUpdated = defaults.lastUpdated;
    	      this.msixPackageFullName = defaults.msixPackageFullName;
    	      this.packageApplications = defaults.packageApplications;
    	      this.packageDependencies = defaults.packageDependencies;
    	      this.packageFamilyName = defaults.packageFamilyName;
    	      this.packageName = defaults.packageName;
    	      this.packageRelativePath = defaults.packageRelativePath;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.version = defaults.version;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder hostPoolName(Output<String> hostPoolName) {
            this.hostPoolName = Objects.requireNonNull(hostPoolName);
            return this;
        }
        public Builder hostPoolName(String hostPoolName) {
            this.hostPoolName = Output.of(Objects.requireNonNull(hostPoolName));
            return this;
        }
        public Builder imagePath(@Nullable Output<String> imagePath) {
            this.imagePath = imagePath;
            return this;
        }
        public Builder imagePath(@Nullable String imagePath) {
            this.imagePath = Codegen.ofNullable(imagePath);
            return this;
        }
        public Builder isActive(@Nullable Output<Boolean> isActive) {
            this.isActive = isActive;
            return this;
        }
        public Builder isActive(@Nullable Boolean isActive) {
            this.isActive = Codegen.ofNullable(isActive);
            return this;
        }
        public Builder isRegularRegistration(@Nullable Output<Boolean> isRegularRegistration) {
            this.isRegularRegistration = isRegularRegistration;
            return this;
        }
        public Builder isRegularRegistration(@Nullable Boolean isRegularRegistration) {
            this.isRegularRegistration = Codegen.ofNullable(isRegularRegistration);
            return this;
        }
        public Builder lastUpdated(@Nullable Output<String> lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }
        public Builder lastUpdated(@Nullable String lastUpdated) {
            this.lastUpdated = Codegen.ofNullable(lastUpdated);
            return this;
        }
        public Builder msixPackageFullName(@Nullable Output<String> msixPackageFullName) {
            this.msixPackageFullName = msixPackageFullName;
            return this;
        }
        public Builder msixPackageFullName(@Nullable String msixPackageFullName) {
            this.msixPackageFullName = Codegen.ofNullable(msixPackageFullName);
            return this;
        }
        public Builder packageApplications(@Nullable Output<List<MsixPackageApplicationsArgs>> packageApplications) {
            this.packageApplications = packageApplications;
            return this;
        }
        public Builder packageApplications(@Nullable List<MsixPackageApplicationsArgs> packageApplications) {
            this.packageApplications = Codegen.ofNullable(packageApplications);
            return this;
        }
        public Builder packageApplications(MsixPackageApplicationsArgs... packageApplications) {
            return packageApplications(List.of(packageApplications));
        }
        public Builder packageDependencies(@Nullable Output<List<MsixPackageDependenciesArgs>> packageDependencies) {
            this.packageDependencies = packageDependencies;
            return this;
        }
        public Builder packageDependencies(@Nullable List<MsixPackageDependenciesArgs> packageDependencies) {
            this.packageDependencies = Codegen.ofNullable(packageDependencies);
            return this;
        }
        public Builder packageDependencies(MsixPackageDependenciesArgs... packageDependencies) {
            return packageDependencies(List.of(packageDependencies));
        }
        public Builder packageFamilyName(@Nullable Output<String> packageFamilyName) {
            this.packageFamilyName = packageFamilyName;
            return this;
        }
        public Builder packageFamilyName(@Nullable String packageFamilyName) {
            this.packageFamilyName = Codegen.ofNullable(packageFamilyName);
            return this;
        }
        public Builder packageName(@Nullable Output<String> packageName) {
            this.packageName = packageName;
            return this;
        }
        public Builder packageName(@Nullable String packageName) {
            this.packageName = Codegen.ofNullable(packageName);
            return this;
        }
        public Builder packageRelativePath(@Nullable Output<String> packageRelativePath) {
            this.packageRelativePath = packageRelativePath;
            return this;
        }
        public Builder packageRelativePath(@Nullable String packageRelativePath) {
            this.packageRelativePath = Codegen.ofNullable(packageRelativePath);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public MSIXPackageArgs build() {
            return new MSIXPackageArgs(displayName, hostPoolName, imagePath, isActive, isRegularRegistration, lastUpdated, msixPackageFullName, packageApplications, packageDependencies, packageFamilyName, packageName, packageRelativePath, resourceGroupName, version);
        }
    }
}
