// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Additional information on Azure IaaS VM specific backup item.
 * 
 */
public final class AzureIaaSVMProtectedItemExtendedInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureIaaSVMProtectedItemExtendedInfoResponse Empty = new AzureIaaSVMProtectedItemExtendedInfoResponse();

    /**
     * The oldest backup copy available for this backup item.
     * 
     */
    @Import(name="oldestRecoveryPoint")
      private final @Nullable String oldestRecoveryPoint;

    public Optional<String> oldestRecoveryPoint() {
        return this.oldestRecoveryPoint == null ? Optional.empty() : Optional.ofNullable(this.oldestRecoveryPoint);
    }

    /**
     * Specifies if backup policy associated with the backup item is inconsistent.
     * 
     */
    @Import(name="policyInconsistent")
      private final @Nullable Boolean policyInconsistent;

    public Optional<Boolean> policyInconsistent() {
        return this.policyInconsistent == null ? Optional.empty() : Optional.ofNullable(this.policyInconsistent);
    }

    /**
     * Number of backup copies available for this backup item.
     * 
     */
    @Import(name="recoveryPointCount")
      private final @Nullable Integer recoveryPointCount;

    public Optional<Integer> recoveryPointCount() {
        return this.recoveryPointCount == null ? Optional.empty() : Optional.ofNullable(this.recoveryPointCount);
    }

    public AzureIaaSVMProtectedItemExtendedInfoResponse(
        @Nullable String oldestRecoveryPoint,
        @Nullable Boolean policyInconsistent,
        @Nullable Integer recoveryPointCount) {
        this.oldestRecoveryPoint = oldestRecoveryPoint;
        this.policyInconsistent = policyInconsistent;
        this.recoveryPointCount = recoveryPointCount;
    }

    private AzureIaaSVMProtectedItemExtendedInfoResponse() {
        this.oldestRecoveryPoint = null;
        this.policyInconsistent = null;
        this.recoveryPointCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureIaaSVMProtectedItemExtendedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String oldestRecoveryPoint;
        private @Nullable Boolean policyInconsistent;
        private @Nullable Integer recoveryPointCount;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureIaaSVMProtectedItemExtendedInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oldestRecoveryPoint = defaults.oldestRecoveryPoint;
    	      this.policyInconsistent = defaults.policyInconsistent;
    	      this.recoveryPointCount = defaults.recoveryPointCount;
        }

        public Builder oldestRecoveryPoint(@Nullable String oldestRecoveryPoint) {
            this.oldestRecoveryPoint = oldestRecoveryPoint;
            return this;
        }
        public Builder policyInconsistent(@Nullable Boolean policyInconsistent) {
            this.policyInconsistent = policyInconsistent;
            return this;
        }
        public Builder recoveryPointCount(@Nullable Integer recoveryPointCount) {
            this.recoveryPointCount = recoveryPointCount;
            return this;
        }        public AzureIaaSVMProtectedItemExtendedInfoResponse build() {
            return new AzureIaaSVMProtectedItemExtendedInfoResponse(oldestRecoveryPoint, policyInconsistent, recoveryPointCount);
        }
    }
}
