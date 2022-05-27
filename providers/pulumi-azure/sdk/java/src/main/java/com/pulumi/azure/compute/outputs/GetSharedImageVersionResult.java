// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.azure.compute.outputs.GetSharedImageVersionTargetRegion;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSharedImageVersionResult {
    /**
     * @return Is this Image Version excluded from the `latest` filter?
     * 
     */
    private final Boolean excludeFromLatest;
    private final String galleryName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String imageName;
    /**
     * @return The supported Azure location where the Shared Image Gallery exists.
     * 
     */
    private final String location;
    /**
     * @return The ID of the Managed Image which was the source of this Shared Image Version.
     * 
     */
    private final String managedImageId;
    /**
     * @return The Azure Region in which this Image Version exists.
     * 
     */
    private final String name;
    /**
     * @return The size of the OS disk snapshot (in Gigabytes) which was the source of this Shared Image Version.
     * 
     */
    private final Integer osDiskImageSizeGb;
    /**
     * @return The ID of the OS disk snapshot which was the source of this Shared Image Version.
     * 
     */
    private final String osDiskSnapshotId;
    private final String resourceGroupName;
    private final @Nullable Boolean sortVersionsBySemver;
    /**
     * @return A mapping of tags assigned to the Shared Image.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return One or more `target_region` blocks as documented below.
     * 
     */
    private final List<GetSharedImageVersionTargetRegion> targetRegions;

    @CustomType.Constructor
    private GetSharedImageVersionResult(
        @CustomType.Parameter("excludeFromLatest") Boolean excludeFromLatest,
        @CustomType.Parameter("galleryName") String galleryName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("imageName") String imageName,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("managedImageId") String managedImageId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("osDiskImageSizeGb") Integer osDiskImageSizeGb,
        @CustomType.Parameter("osDiskSnapshotId") String osDiskSnapshotId,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("sortVersionsBySemver") @Nullable Boolean sortVersionsBySemver,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("targetRegions") List<GetSharedImageVersionTargetRegion> targetRegions) {
        this.excludeFromLatest = excludeFromLatest;
        this.galleryName = galleryName;
        this.id = id;
        this.imageName = imageName;
        this.location = location;
        this.managedImageId = managedImageId;
        this.name = name;
        this.osDiskImageSizeGb = osDiskImageSizeGb;
        this.osDiskSnapshotId = osDiskSnapshotId;
        this.resourceGroupName = resourceGroupName;
        this.sortVersionsBySemver = sortVersionsBySemver;
        this.tags = tags;
        this.targetRegions = targetRegions;
    }

    /**
     * @return Is this Image Version excluded from the `latest` filter?
     * 
     */
    public Boolean excludeFromLatest() {
        return this.excludeFromLatest;
    }
    public String galleryName() {
        return this.galleryName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String imageName() {
        return this.imageName;
    }
    /**
     * @return The supported Azure location where the Shared Image Gallery exists.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The ID of the Managed Image which was the source of this Shared Image Version.
     * 
     */
    public String managedImageId() {
        return this.managedImageId;
    }
    /**
     * @return The Azure Region in which this Image Version exists.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The size of the OS disk snapshot (in Gigabytes) which was the source of this Shared Image Version.
     * 
     */
    public Integer osDiskImageSizeGb() {
        return this.osDiskImageSizeGb;
    }
    /**
     * @return The ID of the OS disk snapshot which was the source of this Shared Image Version.
     * 
     */
    public String osDiskSnapshotId() {
        return this.osDiskSnapshotId;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    public Optional<Boolean> sortVersionsBySemver() {
        return Optional.ofNullable(this.sortVersionsBySemver);
    }
    /**
     * @return A mapping of tags assigned to the Shared Image.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return One or more `target_region` blocks as documented below.
     * 
     */
    public List<GetSharedImageVersionTargetRegion> targetRegions() {
        return this.targetRegions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSharedImageVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean excludeFromLatest;
        private String galleryName;
        private String id;
        private String imageName;
        private String location;
        private String managedImageId;
        private String name;
        private Integer osDiskImageSizeGb;
        private String osDiskSnapshotId;
        private String resourceGroupName;
        private @Nullable Boolean sortVersionsBySemver;
        private Map<String,String> tags;
        private List<GetSharedImageVersionTargetRegion> targetRegions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSharedImageVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludeFromLatest = defaults.excludeFromLatest;
    	      this.galleryName = defaults.galleryName;
    	      this.id = defaults.id;
    	      this.imageName = defaults.imageName;
    	      this.location = defaults.location;
    	      this.managedImageId = defaults.managedImageId;
    	      this.name = defaults.name;
    	      this.osDiskImageSizeGb = defaults.osDiskImageSizeGb;
    	      this.osDiskSnapshotId = defaults.osDiskSnapshotId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sortVersionsBySemver = defaults.sortVersionsBySemver;
    	      this.tags = defaults.tags;
    	      this.targetRegions = defaults.targetRegions;
        }

        public Builder excludeFromLatest(Boolean excludeFromLatest) {
            this.excludeFromLatest = Objects.requireNonNull(excludeFromLatest);
            return this;
        }
        public Builder galleryName(String galleryName) {
            this.galleryName = Objects.requireNonNull(galleryName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder imageName(String imageName) {
            this.imageName = Objects.requireNonNull(imageName);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder managedImageId(String managedImageId) {
            this.managedImageId = Objects.requireNonNull(managedImageId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder osDiskImageSizeGb(Integer osDiskImageSizeGb) {
            this.osDiskImageSizeGb = Objects.requireNonNull(osDiskImageSizeGb);
            return this;
        }
        public Builder osDiskSnapshotId(String osDiskSnapshotId) {
            this.osDiskSnapshotId = Objects.requireNonNull(osDiskSnapshotId);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder sortVersionsBySemver(@Nullable Boolean sortVersionsBySemver) {
            this.sortVersionsBySemver = sortVersionsBySemver;
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder targetRegions(List<GetSharedImageVersionTargetRegion> targetRegions) {
            this.targetRegions = Objects.requireNonNull(targetRegions);
            return this;
        }
        public Builder targetRegions(GetSharedImageVersionTargetRegion... targetRegions) {
            return targetRegions(List.of(targetRegions));
        }        public GetSharedImageVersionResult build() {
            return new GetSharedImageVersionResult(excludeFromLatest, galleryName, id, imageName, location, managedImageId, name, osDiskImageSizeGb, osDiskSnapshotId, resourceGroupName, sortVersionsBySemver, tags, targetRegions);
        }
    }
}
