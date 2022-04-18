// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InviteAccepterState extends com.pulumi.resources.ResourceArgs {

    public static final InviteAccepterState Empty = new InviteAccepterState();

    /**
     * The detector ID of the member GuardDuty account.
     * 
     */
    @Import(name="detectorId")
      private final @Nullable Output<String> detectorId;

    public Output<String> detectorId() {
        return this.detectorId == null ? Codegen.empty() : this.detectorId;
    }

    /**
     * AWS account ID for primary account.
     * 
     */
    @Import(name="masterAccountId")
      private final @Nullable Output<String> masterAccountId;

    public Output<String> masterAccountId() {
        return this.masterAccountId == null ? Codegen.empty() : this.masterAccountId;
    }

    public InviteAccepterState(
        @Nullable Output<String> detectorId,
        @Nullable Output<String> masterAccountId) {
        this.detectorId = detectorId;
        this.masterAccountId = masterAccountId;
    }

    private InviteAccepterState() {
        this.detectorId = Codegen.empty();
        this.masterAccountId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InviteAccepterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> detectorId;
        private @Nullable Output<String> masterAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(InviteAccepterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.detectorId = defaults.detectorId;
    	      this.masterAccountId = defaults.masterAccountId;
        }

        public Builder detectorId(@Nullable Output<String> detectorId) {
            this.detectorId = detectorId;
            return this;
        }
        public Builder detectorId(@Nullable String detectorId) {
            this.detectorId = Codegen.ofNullable(detectorId);
            return this;
        }
        public Builder masterAccountId(@Nullable Output<String> masterAccountId) {
            this.masterAccountId = masterAccountId;
            return this;
        }
        public Builder masterAccountId(@Nullable String masterAccountId) {
            this.masterAccountId = Codegen.ofNullable(masterAccountId);
            return this;
        }        public InviteAccepterState build() {
            return new InviteAccepterState(detectorId, masterAccountId);
        }
    }
}
