// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MountPointMapResponse {
    /**
     * Mount point for the share.
     * 
     */
    private final String mountPoint;
    /**
     * Mounting type.
     * 
     */
    private final String mountType;
    /**
     * ID of the role to which share is mounted.
     * 
     */
    private final String roleId;
    /**
     * Role type.
     * 
     */
    private final String roleType;
    /**
     * ID of the share mounted to the role VM.
     * 
     */
    private final String shareId;

    @CustomType.Constructor
    private MountPointMapResponse(
        @CustomType.Parameter("mountPoint") String mountPoint,
        @CustomType.Parameter("mountType") String mountType,
        @CustomType.Parameter("roleId") String roleId,
        @CustomType.Parameter("roleType") String roleType,
        @CustomType.Parameter("shareId") String shareId) {
        this.mountPoint = mountPoint;
        this.mountType = mountType;
        this.roleId = roleId;
        this.roleType = roleType;
        this.shareId = shareId;
    }

    /**
     * Mount point for the share.
     * 
    */
    public String mountPoint() {
        return this.mountPoint;
    }
    /**
     * Mounting type.
     * 
    */
    public String mountType() {
        return this.mountType;
    }
    /**
     * ID of the role to which share is mounted.
     * 
    */
    public String roleId() {
        return this.roleId;
    }
    /**
     * Role type.
     * 
    */
    public String roleType() {
        return this.roleType;
    }
    /**
     * ID of the share mounted to the role VM.
     * 
    */
    public String shareId() {
        return this.shareId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MountPointMapResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mountPoint;
        private String mountType;
        private String roleId;
        private String roleType;
        private String shareId;

        public Builder() {
    	      // Empty
        }

        public Builder(MountPointMapResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPoint = defaults.mountPoint;
    	      this.mountType = defaults.mountType;
    	      this.roleId = defaults.roleId;
    	      this.roleType = defaults.roleType;
    	      this.shareId = defaults.shareId;
        }

        public Builder mountPoint(String mountPoint) {
            this.mountPoint = Objects.requireNonNull(mountPoint);
            return this;
        }
        public Builder mountType(String mountType) {
            this.mountType = Objects.requireNonNull(mountType);
            return this;
        }
        public Builder roleId(String roleId) {
            this.roleId = Objects.requireNonNull(roleId);
            return this;
        }
        public Builder roleType(String roleType) {
            this.roleType = Objects.requireNonNull(roleType);
            return this;
        }
        public Builder shareId(String shareId) {
            this.shareId = Objects.requireNonNull(shareId);
            return this;
        }        public MountPointMapResponse build() {
            return new MountPointMapResponse(mountPoint, mountType, roleId, roleType, shareId);
        }
    }
}
