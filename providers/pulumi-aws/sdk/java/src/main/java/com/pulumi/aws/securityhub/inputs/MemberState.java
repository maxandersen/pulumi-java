// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MemberState extends com.pulumi.resources.ResourceArgs {

    public static final MemberState Empty = new MemberState();

    /**
     * The ID of the member AWS account.
     * 
     */
    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId == null ? Codegen.empty() : this.accountId;
    }

    /**
     * The email of the member AWS account.
     * 
     */
    @Import(name="email")
      private final @Nullable Output<String> email;

    public Output<String> email() {
        return this.email == null ? Codegen.empty() : this.email;
    }

    /**
     * Boolean whether to invite the account to Security Hub as a member. Defaults to `false`.
     * 
     */
    @Import(name="invite")
      private final @Nullable Output<Boolean> invite;

    public Output<Boolean> invite() {
        return this.invite == null ? Codegen.empty() : this.invite;
    }

    /**
     * The ID of the master Security Hub AWS account.
     * 
     */
    @Import(name="masterId")
      private final @Nullable Output<String> masterId;

    public Output<String> masterId() {
        return this.masterId == null ? Codegen.empty() : this.masterId;
    }

    /**
     * The status of the member account relationship.
     * 
     */
    @Import(name="memberStatus")
      private final @Nullable Output<String> memberStatus;

    public Output<String> memberStatus() {
        return this.memberStatus == null ? Codegen.empty() : this.memberStatus;
    }

    public MemberState(
        @Nullable Output<String> accountId,
        @Nullable Output<String> email,
        @Nullable Output<Boolean> invite,
        @Nullable Output<String> masterId,
        @Nullable Output<String> memberStatus) {
        this.accountId = accountId;
        this.email = email;
        this.invite = invite;
        this.masterId = masterId;
        this.memberStatus = memberStatus;
    }

    private MemberState() {
        this.accountId = Codegen.empty();
        this.email = Codegen.empty();
        this.invite = Codegen.empty();
        this.masterId = Codegen.empty();
        this.memberStatus = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private @Nullable Output<String> email;
        private @Nullable Output<Boolean> invite;
        private @Nullable Output<String> masterId;
        private @Nullable Output<String> memberStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(MemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.email = defaults.email;
    	      this.invite = defaults.invite;
    	      this.masterId = defaults.masterId;
    	      this.memberStatus = defaults.memberStatus;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountId(@Nullable String accountId) {
            this.accountId = Codegen.ofNullable(accountId);
            return this;
        }
        public Builder email(@Nullable Output<String> email) {
            this.email = email;
            return this;
        }
        public Builder email(@Nullable String email) {
            this.email = Codegen.ofNullable(email);
            return this;
        }
        public Builder invite(@Nullable Output<Boolean> invite) {
            this.invite = invite;
            return this;
        }
        public Builder invite(@Nullable Boolean invite) {
            this.invite = Codegen.ofNullable(invite);
            return this;
        }
        public Builder masterId(@Nullable Output<String> masterId) {
            this.masterId = masterId;
            return this;
        }
        public Builder masterId(@Nullable String masterId) {
            this.masterId = Codegen.ofNullable(masterId);
            return this;
        }
        public Builder memberStatus(@Nullable Output<String> memberStatus) {
            this.memberStatus = memberStatus;
            return this;
        }
        public Builder memberStatus(@Nullable String memberStatus) {
            this.memberStatus = Codegen.ofNullable(memberStatus);
            return this;
        }        public MemberState build() {
            return new MemberState(accountId, email, invite, masterId, memberStatus);
        }
    }
}
