// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.SubProtectionPolicyResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure VM (Mercury) workload-specific backup policy.
 * 
 */
public final class GenericProtectionPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final GenericProtectionPolicyResponse Empty = new GenericProtectionPolicyResponse();

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'GenericProtectionPolicy'.
     * 
     */
    @Import(name="backupManagementType", required=true)
      private final String backupManagementType;

    public String backupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Name of this policy's fabric.
     * 
     */
    @Import(name="fabricName")
      private final @Nullable String fabricName;

    public Optional<String> fabricName() {
        return this.fabricName == null ? Optional.empty() : Optional.ofNullable(this.fabricName);
    }

    /**
     * Number of items associated with this policy.
     * 
     */
    @Import(name="protectedItemsCount")
      private final @Nullable Integer protectedItemsCount;

    public Optional<Integer> protectedItemsCount() {
        return this.protectedItemsCount == null ? Optional.empty() : Optional.ofNullable(this.protectedItemsCount);
    }

    /**
     * List of sub-protection policies which includes schedule and retention
     * 
     */
    @Import(name="subProtectionPolicy")
      private final @Nullable List<SubProtectionPolicyResponse> subProtectionPolicy;

    public List<SubProtectionPolicyResponse> subProtectionPolicy() {
        return this.subProtectionPolicy == null ? List.of() : this.subProtectionPolicy;
    }

    /**
     * TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     * 
     */
    @Import(name="timeZone")
      private final @Nullable String timeZone;

    public Optional<String> timeZone() {
        return this.timeZone == null ? Optional.empty() : Optional.ofNullable(this.timeZone);
    }

    public GenericProtectionPolicyResponse(
        String backupManagementType,
        @Nullable String fabricName,
        @Nullable Integer protectedItemsCount,
        @Nullable List<SubProtectionPolicyResponse> subProtectionPolicy,
        @Nullable String timeZone) {
        this.backupManagementType = Objects.requireNonNull(backupManagementType, "expected parameter 'backupManagementType' to be non-null");
        this.fabricName = fabricName;
        this.protectedItemsCount = protectedItemsCount;
        this.subProtectionPolicy = subProtectionPolicy;
        this.timeZone = timeZone;
    }

    private GenericProtectionPolicyResponse() {
        this.backupManagementType = null;
        this.fabricName = null;
        this.protectedItemsCount = null;
        this.subProtectionPolicy = List.of();
        this.timeZone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GenericProtectionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupManagementType;
        private @Nullable String fabricName;
        private @Nullable Integer protectedItemsCount;
        private @Nullable List<SubProtectionPolicyResponse> subProtectionPolicy;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(GenericProtectionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.fabricName = defaults.fabricName;
    	      this.protectedItemsCount = defaults.protectedItemsCount;
    	      this.subProtectionPolicy = defaults.subProtectionPolicy;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder backupManagementType(String backupManagementType) {
            this.backupManagementType = Objects.requireNonNull(backupManagementType);
            return this;
        }
        public Builder fabricName(@Nullable String fabricName) {
            this.fabricName = fabricName;
            return this;
        }
        public Builder protectedItemsCount(@Nullable Integer protectedItemsCount) {
            this.protectedItemsCount = protectedItemsCount;
            return this;
        }
        public Builder subProtectionPolicy(@Nullable List<SubProtectionPolicyResponse> subProtectionPolicy) {
            this.subProtectionPolicy = subProtectionPolicy;
            return this;
        }
        public Builder subProtectionPolicy(SubProtectionPolicyResponse... subProtectionPolicy) {
            return subProtectionPolicy(List.of(subProtectionPolicy));
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }        public GenericProtectionPolicyResponse build() {
            return new GenericProtectionPolicyResponse(backupManagementType, fabricName, protectedItemsCount, subProtectionPolicy, timeZone);
        }
    }
}
