// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.azurenative.recoveryservices.outputs.LogSchedulePolicyResponse;
import com.pulumi.azurenative.recoveryservices.outputs.LongTermRetentionPolicyResponse;
import com.pulumi.azurenative.recoveryservices.outputs.LongTermSchedulePolicyResponse;
import com.pulumi.azurenative.recoveryservices.outputs.SimpleRetentionPolicyResponse;
import com.pulumi.azurenative.recoveryservices.outputs.SimpleSchedulePolicyResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureFileShareProtectionPolicyResponse {
    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'AzureStorage'.
     * 
     */
    private final String backupManagementType;
    /**
     * Number of items associated with this policy.
     * 
     */
    private final @Nullable Integer protectedItemsCount;
    /**
     * Retention policy with the details on backup copy retention ranges.
     * 
     */
    private final @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy;
    /**
     * Backup schedule specified as part of backup policy.
     * 
     */
    private final @Nullable Object schedulePolicy;
    /**
     * TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     * 
     */
    private final @Nullable String timeZone;
    /**
     * Type of workload for the backup management
     * 
     */
    private final @Nullable String workLoadType;

    @CustomType.Constructor
    private AzureFileShareProtectionPolicyResponse(
        @CustomType.Parameter("backupManagementType") String backupManagementType,
        @CustomType.Parameter("protectedItemsCount") @Nullable Integer protectedItemsCount,
        @CustomType.Parameter("retentionPolicy") @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy,
        @CustomType.Parameter("schedulePolicy") @Nullable Object schedulePolicy,
        @CustomType.Parameter("timeZone") @Nullable String timeZone,
        @CustomType.Parameter("workLoadType") @Nullable String workLoadType) {
        this.backupManagementType = backupManagementType;
        this.protectedItemsCount = protectedItemsCount;
        this.retentionPolicy = retentionPolicy;
        this.schedulePolicy = schedulePolicy;
        this.timeZone = timeZone;
        this.workLoadType = workLoadType;
    }

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'AzureStorage'.
     * 
    */
    public String backupManagementType() {
        return this.backupManagementType;
    }
    /**
     * Number of items associated with this policy.
     * 
    */
    public Optional<Integer> protectedItemsCount() {
        return Optional.ofNullable(this.protectedItemsCount);
    }
    /**
     * Retention policy with the details on backup copy retention ranges.
     * 
    */
    public Optional<Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse>> retentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }
    /**
     * Backup schedule specified as part of backup policy.
     * 
    */
    public Optional<Object> schedulePolicy() {
        return Optional.ofNullable(this.schedulePolicy);
    }
    /**
     * TimeZone optional input as string. For example: TimeZone = "Pacific Standard Time".
     * 
    */
    public Optional<String> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }
    /**
     * Type of workload for the backup management
     * 
    */
    public Optional<String> workLoadType() {
        return Optional.ofNullable(this.workLoadType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFileShareProtectionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupManagementType;
        private @Nullable Integer protectedItemsCount;
        private @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy;
        private @Nullable Object schedulePolicy;
        private @Nullable String timeZone;
        private @Nullable String workLoadType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFileShareProtectionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.protectedItemsCount = defaults.protectedItemsCount;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.schedulePolicy = defaults.schedulePolicy;
    	      this.timeZone = defaults.timeZone;
    	      this.workLoadType = defaults.workLoadType;
        }

        public Builder backupManagementType(String backupManagementType) {
            this.backupManagementType = Objects.requireNonNull(backupManagementType);
            return this;
        }
        public Builder protectedItemsCount(@Nullable Integer protectedItemsCount) {
            this.protectedItemsCount = protectedItemsCount;
            return this;
        }
        public Builder retentionPolicy(@Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }
        public Builder schedulePolicy(@Nullable Object schedulePolicy) {
            this.schedulePolicy = schedulePolicy;
            return this;
        }
        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public Builder workLoadType(@Nullable String workLoadType) {
            this.workLoadType = workLoadType;
            return this;
        }        public AzureFileShareProtectionPolicyResponse build() {
            return new AzureFileShareProtectionPolicyResponse(backupManagementType, protectedItemsCount, retentionPolicy, schedulePolicy, timeZone, workLoadType);
        }
    }
}
