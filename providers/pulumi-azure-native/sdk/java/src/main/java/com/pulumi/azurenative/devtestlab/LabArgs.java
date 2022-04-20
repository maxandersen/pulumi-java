// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab;

import com.pulumi.azurenative.devtestlab.enums.EnvironmentPermission;
import com.pulumi.azurenative.devtestlab.enums.PremiumDataDisk;
import com.pulumi.azurenative.devtestlab.enums.StorageType;
import com.pulumi.azurenative.devtestlab.inputs.LabAnnouncementPropertiesArgs;
import com.pulumi.azurenative.devtestlab.inputs.LabSupportPropertiesArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LabArgs extends com.pulumi.resources.ResourceArgs {

    public static final LabArgs Empty = new LabArgs();

    /**
     * The properties of any lab announcement associated with this lab
     * 
     */
    @Import(name="announcement")
      private final @Nullable Output<LabAnnouncementPropertiesArgs> announcement;

    public Output<LabAnnouncementPropertiesArgs> announcement() {
        return this.announcement == null ? Codegen.empty() : this.announcement;
    }

    /**
     * The access rights to be granted to the user when provisioning an environment
     * 
     */
    @Import(name="environmentPermission")
      private final @Nullable Output<Either<String,EnvironmentPermission>> environmentPermission;

    public Output<Either<String,EnvironmentPermission>> environmentPermission() {
        return this.environmentPermission == null ? Codegen.empty() : this.environmentPermission;
    }

    /**
     * Extended properties of the lab used for experimental features
     * 
     */
    @Import(name="extendedProperties")
      private final @Nullable Output<Map<String,String>> extendedProperties;

    public Output<Map<String,String>> extendedProperties() {
        return this.extendedProperties == null ? Codegen.empty() : this.extendedProperties;
    }

    /**
     * Type of storage used by the lab. It can be either Premium or Standard. Default is Premium.
     * 
     */
    @Import(name="labStorageType")
      private final @Nullable Output<Either<String,StorageType>> labStorageType;

    public Output<Either<String,StorageType>> labStorageType() {
        return this.labStorageType == null ? Codegen.empty() : this.labStorageType;
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The ordered list of artifact resource IDs that should be applied on all Linux VM creations by default, prior to the artifacts specified by the user.
     * 
     */
    @Import(name="mandatoryArtifactsResourceIdsLinux")
      private final @Nullable Output<List<String>> mandatoryArtifactsResourceIdsLinux;

    public Output<List<String>> mandatoryArtifactsResourceIdsLinux() {
        return this.mandatoryArtifactsResourceIdsLinux == null ? Codegen.empty() : this.mandatoryArtifactsResourceIdsLinux;
    }

    /**
     * The ordered list of artifact resource IDs that should be applied on all Windows VM creations by default, prior to the artifacts specified by the user.
     * 
     */
    @Import(name="mandatoryArtifactsResourceIdsWindows")
      private final @Nullable Output<List<String>> mandatoryArtifactsResourceIdsWindows;

    public Output<List<String>> mandatoryArtifactsResourceIdsWindows() {
        return this.mandatoryArtifactsResourceIdsWindows == null ? Codegen.empty() : this.mandatoryArtifactsResourceIdsWindows;
    }

    /**
     * The name of the lab.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The setting to enable usage of premium data disks.
     * When its value is &#39;Enabled&#39;, creation of standard or premium data disks is allowed.
     * When its value is &#39;Disabled&#39;, only creation of standard data disks is allowed.
     * 
     */
    @Import(name="premiumDataDisks")
      private final @Nullable Output<Either<String,PremiumDataDisk>> premiumDataDisks;

    public Output<Either<String,PremiumDataDisk>> premiumDataDisks() {
        return this.premiumDataDisks == null ? Codegen.empty() : this.premiumDataDisks;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The properties of any lab support message associated with this lab
     * 
     */
    @Import(name="support")
      private final @Nullable Output<LabSupportPropertiesArgs> support;

    public Output<LabSupportPropertiesArgs> support() {
        return this.support == null ? Codegen.empty() : this.support;
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public LabArgs(
        @Nullable Output<LabAnnouncementPropertiesArgs> announcement,
        @Nullable Output<Either<String,EnvironmentPermission>> environmentPermission,
        @Nullable Output<Map<String,String>> extendedProperties,
        @Nullable Output<Either<String,StorageType>> labStorageType,
        @Nullable Output<String> location,
        @Nullable Output<List<String>> mandatoryArtifactsResourceIdsLinux,
        @Nullable Output<List<String>> mandatoryArtifactsResourceIdsWindows,
        @Nullable Output<String> name,
        @Nullable Output<Either<String,PremiumDataDisk>> premiumDataDisks,
        Output<String> resourceGroupName,
        @Nullable Output<LabSupportPropertiesArgs> support,
        @Nullable Output<Map<String,String>> tags) {
        this.announcement = announcement;
        this.environmentPermission = environmentPermission;
        this.extendedProperties = extendedProperties;
        this.labStorageType = Codegen.stringProp("labStorageType").left(StorageType.class).output().arg(labStorageType).def("Premium").getNullable();
        this.location = location;
        this.mandatoryArtifactsResourceIdsLinux = mandatoryArtifactsResourceIdsLinux;
        this.mandatoryArtifactsResourceIdsWindows = mandatoryArtifactsResourceIdsWindows;
        this.name = name;
        this.premiumDataDisks = premiumDataDisks;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.support = support;
        this.tags = tags;
    }

    private LabArgs() {
        this.announcement = Codegen.empty();
        this.environmentPermission = Codegen.empty();
        this.extendedProperties = Codegen.empty();
        this.labStorageType = Codegen.empty();
        this.location = Codegen.empty();
        this.mandatoryArtifactsResourceIdsLinux = Codegen.empty();
        this.mandatoryArtifactsResourceIdsWindows = Codegen.empty();
        this.name = Codegen.empty();
        this.premiumDataDisks = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.support = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<LabAnnouncementPropertiesArgs> announcement;
        private @Nullable Output<Either<String,EnvironmentPermission>> environmentPermission;
        private @Nullable Output<Map<String,String>> extendedProperties;
        private @Nullable Output<Either<String,StorageType>> labStorageType;
        private @Nullable Output<String> location;
        private @Nullable Output<List<String>> mandatoryArtifactsResourceIdsLinux;
        private @Nullable Output<List<String>> mandatoryArtifactsResourceIdsWindows;
        private @Nullable Output<String> name;
        private @Nullable Output<Either<String,PremiumDataDisk>> premiumDataDisks;
        private Output<String> resourceGroupName;
        private @Nullable Output<LabSupportPropertiesArgs> support;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LabArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.announcement = defaults.announcement;
    	      this.environmentPermission = defaults.environmentPermission;
    	      this.extendedProperties = defaults.extendedProperties;
    	      this.labStorageType = defaults.labStorageType;
    	      this.location = defaults.location;
    	      this.mandatoryArtifactsResourceIdsLinux = defaults.mandatoryArtifactsResourceIdsLinux;
    	      this.mandatoryArtifactsResourceIdsWindows = defaults.mandatoryArtifactsResourceIdsWindows;
    	      this.name = defaults.name;
    	      this.premiumDataDisks = defaults.premiumDataDisks;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.support = defaults.support;
    	      this.tags = defaults.tags;
        }

        public Builder announcement(@Nullable Output<LabAnnouncementPropertiesArgs> announcement) {
            this.announcement = announcement;
            return this;
        }
        public Builder announcement(@Nullable LabAnnouncementPropertiesArgs announcement) {
            this.announcement = Codegen.ofNullable(announcement);
            return this;
        }
        public Builder environmentPermission(@Nullable Output<Either<String,EnvironmentPermission>> environmentPermission) {
            this.environmentPermission = environmentPermission;
            return this;
        }
        public Builder environmentPermission(@Nullable Either<String,EnvironmentPermission> environmentPermission) {
            this.environmentPermission = Codegen.ofNullable(environmentPermission);
            return this;
        }
        public Builder extendedProperties(@Nullable Output<Map<String,String>> extendedProperties) {
            this.extendedProperties = extendedProperties;
            return this;
        }
        public Builder extendedProperties(@Nullable Map<String,String> extendedProperties) {
            this.extendedProperties = Codegen.ofNullable(extendedProperties);
            return this;
        }
        public Builder labStorageType(@Nullable Output<Either<String,StorageType>> labStorageType) {
            this.labStorageType = labStorageType;
            return this;
        }
        public Builder labStorageType(@Nullable Either<String,StorageType> labStorageType) {
            this.labStorageType = Codegen.ofNullable(labStorageType);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder mandatoryArtifactsResourceIdsLinux(@Nullable Output<List<String>> mandatoryArtifactsResourceIdsLinux) {
            this.mandatoryArtifactsResourceIdsLinux = mandatoryArtifactsResourceIdsLinux;
            return this;
        }
        public Builder mandatoryArtifactsResourceIdsLinux(@Nullable List<String> mandatoryArtifactsResourceIdsLinux) {
            this.mandatoryArtifactsResourceIdsLinux = Codegen.ofNullable(mandatoryArtifactsResourceIdsLinux);
            return this;
        }
        public Builder mandatoryArtifactsResourceIdsLinux(String... mandatoryArtifactsResourceIdsLinux) {
            return mandatoryArtifactsResourceIdsLinux(List.of(mandatoryArtifactsResourceIdsLinux));
        }
        public Builder mandatoryArtifactsResourceIdsWindows(@Nullable Output<List<String>> mandatoryArtifactsResourceIdsWindows) {
            this.mandatoryArtifactsResourceIdsWindows = mandatoryArtifactsResourceIdsWindows;
            return this;
        }
        public Builder mandatoryArtifactsResourceIdsWindows(@Nullable List<String> mandatoryArtifactsResourceIdsWindows) {
            this.mandatoryArtifactsResourceIdsWindows = Codegen.ofNullable(mandatoryArtifactsResourceIdsWindows);
            return this;
        }
        public Builder mandatoryArtifactsResourceIdsWindows(String... mandatoryArtifactsResourceIdsWindows) {
            return mandatoryArtifactsResourceIdsWindows(List.of(mandatoryArtifactsResourceIdsWindows));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder premiumDataDisks(@Nullable Output<Either<String,PremiumDataDisk>> premiumDataDisks) {
            this.premiumDataDisks = premiumDataDisks;
            return this;
        }
        public Builder premiumDataDisks(@Nullable Either<String,PremiumDataDisk> premiumDataDisks) {
            this.premiumDataDisks = Codegen.ofNullable(premiumDataDisks);
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
        public Builder support(@Nullable Output<LabSupportPropertiesArgs> support) {
            this.support = support;
            return this;
        }
        public Builder support(@Nullable LabSupportPropertiesArgs support) {
            this.support = Codegen.ofNullable(support);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public LabArgs build() {
            return new LabArgs(announcement, environmentPermission, extendedProperties, labStorageType, location, mandatoryArtifactsResourceIdsLinux, mandatoryArtifactsResourceIdsWindows, name, premiumDataDisks, resourceGroupName, support, tags);
        }
    }
}
