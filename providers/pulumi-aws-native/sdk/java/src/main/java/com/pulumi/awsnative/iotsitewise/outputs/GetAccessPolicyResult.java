// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.outputs;

import com.pulumi.awsnative.iotsitewise.outputs.AccessPolicyIdentity;
import com.pulumi.awsnative.iotsitewise.outputs.AccessPolicyResource;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAccessPolicyResult {
    /**
     * @return The ARN of the access policy.
     * 
     */
    private final @Nullable String accessPolicyArn;
    /**
     * @return The ID of the access policy.
     * 
     */
    private final @Nullable String accessPolicyId;
    /**
     * @return The identity for this access policy. Choose either a user or a group but not both.
     * 
     */
    private final @Nullable AccessPolicyIdentity accessPolicyIdentity;
    /**
     * @return The permission level for this access policy. Valid values are ADMINISTRATOR or VIEWER.
     * 
     */
    private final @Nullable String accessPolicyPermission;
    /**
     * @return The AWS IoT SiteWise Monitor resource for this access policy. Choose either portal or project but not both.
     * 
     */
    private final @Nullable AccessPolicyResource accessPolicyResource;

    @CustomType.Constructor
    private GetAccessPolicyResult(
        @CustomType.Parameter("accessPolicyArn") @Nullable String accessPolicyArn,
        @CustomType.Parameter("accessPolicyId") @Nullable String accessPolicyId,
        @CustomType.Parameter("accessPolicyIdentity") @Nullable AccessPolicyIdentity accessPolicyIdentity,
        @CustomType.Parameter("accessPolicyPermission") @Nullable String accessPolicyPermission,
        @CustomType.Parameter("accessPolicyResource") @Nullable AccessPolicyResource accessPolicyResource) {
        this.accessPolicyArn = accessPolicyArn;
        this.accessPolicyId = accessPolicyId;
        this.accessPolicyIdentity = accessPolicyIdentity;
        this.accessPolicyPermission = accessPolicyPermission;
        this.accessPolicyResource = accessPolicyResource;
    }

    /**
     * @return The ARN of the access policy.
     * 
     */
    public Optional<String> accessPolicyArn() {
        return Optional.ofNullable(this.accessPolicyArn);
    }
    /**
     * @return The ID of the access policy.
     * 
     */
    public Optional<String> accessPolicyId() {
        return Optional.ofNullable(this.accessPolicyId);
    }
    /**
     * @return The identity for this access policy. Choose either a user or a group but not both.
     * 
     */
    public Optional<AccessPolicyIdentity> accessPolicyIdentity() {
        return Optional.ofNullable(this.accessPolicyIdentity);
    }
    /**
     * @return The permission level for this access policy. Valid values are ADMINISTRATOR or VIEWER.
     * 
     */
    public Optional<String> accessPolicyPermission() {
        return Optional.ofNullable(this.accessPolicyPermission);
    }
    /**
     * @return The AWS IoT SiteWise Monitor resource for this access policy. Choose either portal or project but not both.
     * 
     */
    public Optional<AccessPolicyResource> accessPolicyResource() {
        return Optional.ofNullable(this.accessPolicyResource);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessPolicyArn;
        private @Nullable String accessPolicyId;
        private @Nullable AccessPolicyIdentity accessPolicyIdentity;
        private @Nullable String accessPolicyPermission;
        private @Nullable AccessPolicyResource accessPolicyResource;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicyArn = defaults.accessPolicyArn;
    	      this.accessPolicyId = defaults.accessPolicyId;
    	      this.accessPolicyIdentity = defaults.accessPolicyIdentity;
    	      this.accessPolicyPermission = defaults.accessPolicyPermission;
    	      this.accessPolicyResource = defaults.accessPolicyResource;
        }

        public Builder accessPolicyArn(@Nullable String accessPolicyArn) {
            this.accessPolicyArn = accessPolicyArn;
            return this;
        }
        public Builder accessPolicyId(@Nullable String accessPolicyId) {
            this.accessPolicyId = accessPolicyId;
            return this;
        }
        public Builder accessPolicyIdentity(@Nullable AccessPolicyIdentity accessPolicyIdentity) {
            this.accessPolicyIdentity = accessPolicyIdentity;
            return this;
        }
        public Builder accessPolicyPermission(@Nullable String accessPolicyPermission) {
            this.accessPolicyPermission = accessPolicyPermission;
            return this;
        }
        public Builder accessPolicyResource(@Nullable AccessPolicyResource accessPolicyResource) {
            this.accessPolicyResource = accessPolicyResource;
            return this;
        }        public GetAccessPolicyResult build() {
            return new GetAccessPolicyResult(accessPolicyArn, accessPolicyId, accessPolicyIdentity, accessPolicyPermission, accessPolicyResource);
        }
    }
}
