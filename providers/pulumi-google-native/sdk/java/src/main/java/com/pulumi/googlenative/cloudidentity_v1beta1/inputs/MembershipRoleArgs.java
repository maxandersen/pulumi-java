// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudidentity_v1beta1.inputs.ExpiryDetailArgs;
import com.pulumi.googlenative.cloudidentity_v1beta1.inputs.RestrictionEvaluationsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A membership role within the Cloud Identity Groups API. A `MembershipRole` defines the privileges granted to a `Membership`.
 * 
 */
public final class MembershipRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final MembershipRoleArgs Empty = new MembershipRoleArgs();

    /**
     * The expiry details of the `MembershipRole`. Expiry details are only supported for `MEMBER` `MembershipRoles`. May be set if `name` is `MEMBER`. Must not be set if `name` is any other value.
     * 
     */
    @Import(name="expiryDetail")
    private @Nullable Output<ExpiryDetailArgs> expiryDetail;

    public Optional<Output<ExpiryDetailArgs>> expiryDetail() {
        return Optional.ofNullable(this.expiryDetail);
    }

    /**
     * The name of the `MembershipRole`. Must be one of `OWNER`, `MANAGER`, `MEMBER`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Evaluations of restrictions applied to parent group on this membership.
     * 
     */
    @Import(name="restrictionEvaluations")
    private @Nullable Output<RestrictionEvaluationsArgs> restrictionEvaluations;

    public Optional<Output<RestrictionEvaluationsArgs>> restrictionEvaluations() {
        return Optional.ofNullable(this.restrictionEvaluations);
    }

    private MembershipRoleArgs() {}

    private MembershipRoleArgs(MembershipRoleArgs $) {
        this.expiryDetail = $.expiryDetail;
        this.name = $.name;
        this.restrictionEvaluations = $.restrictionEvaluations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MembershipRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MembershipRoleArgs $;

        public Builder() {
            $ = new MembershipRoleArgs();
        }

        public Builder(MembershipRoleArgs defaults) {
            $ = new MembershipRoleArgs(Objects.requireNonNull(defaults));
        }

        public Builder expiryDetail(@Nullable Output<ExpiryDetailArgs> expiryDetail) {
            $.expiryDetail = expiryDetail;
            return this;
        }

        public Builder expiryDetail(ExpiryDetailArgs expiryDetail) {
            return expiryDetail(Output.of(expiryDetail));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder restrictionEvaluations(@Nullable Output<RestrictionEvaluationsArgs> restrictionEvaluations) {
            $.restrictionEvaluations = restrictionEvaluations;
            return this;
        }

        public Builder restrictionEvaluations(RestrictionEvaluationsArgs restrictionEvaluations) {
            return restrictionEvaluations(Output.of(restrictionEvaluations));
        }

        public MembershipRoleArgs build() {
            return $;
        }
    }

}
