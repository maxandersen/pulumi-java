// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_v1.enums.ShareSettingsShareType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The share setting for reservations and sole tenancy node groups.
 * 
 */
public final class ShareSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ShareSettingsArgs Empty = new ShareSettingsArgs();

    /**
     * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
     * 
     */
    @Import(name="projectMap")
      private final @Nullable Output<Map<String,String>> projectMap;

    public Output<Map<String,String>> projectMap() {
        return this.projectMap == null ? Codegen.empty() : this.projectMap;
    }

    /**
     * Type of sharing for this shared-reservation
     * 
     */
    @Import(name="shareType")
      private final @Nullable Output<ShareSettingsShareType> shareType;

    public Output<ShareSettingsShareType> shareType() {
        return this.shareType == null ? Codegen.empty() : this.shareType;
    }

    public ShareSettingsArgs(
        @Nullable Output<Map<String,String>> projectMap,
        @Nullable Output<ShareSettingsShareType> shareType) {
        this.projectMap = projectMap;
        this.shareType = shareType;
    }

    private ShareSettingsArgs() {
        this.projectMap = Codegen.empty();
        this.shareType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShareSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> projectMap;
        private @Nullable Output<ShareSettingsShareType> shareType;

        public Builder() {
    	      // Empty
        }

        public Builder(ShareSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectMap = defaults.projectMap;
    	      this.shareType = defaults.shareType;
        }

        public Builder projectMap(@Nullable Output<Map<String,String>> projectMap) {
            this.projectMap = projectMap;
            return this;
        }
        public Builder projectMap(@Nullable Map<String,String> projectMap) {
            this.projectMap = Codegen.ofNullable(projectMap);
            return this;
        }
        public Builder shareType(@Nullable Output<ShareSettingsShareType> shareType) {
            this.shareType = shareType;
            return this;
        }
        public Builder shareType(@Nullable ShareSettingsShareType shareType) {
            this.shareType = Codegen.ofNullable(shareType);
            return this;
        }        public ShareSettingsArgs build() {
            return new ShareSettingsArgs(projectMap, shareType);
        }
    }
}
