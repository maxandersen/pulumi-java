// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudidentity_v1beta1.inputs.MembershipRoleRestrictionEvaluationResponse;
import java.util.Objects;


/**
 * Evaluations of restrictions applied to parent group on this membership.
 * 
 */
public final class RestrictionEvaluationsResponse extends com.pulumi.resources.InvokeArgs {

    public static final RestrictionEvaluationsResponse Empty = new RestrictionEvaluationsResponse();

    /**
     * Evaluation of the member restriction applied to this membership. Empty if the user lacks permission to view the restriction evaluation.
     * 
     */
    @Import(name="memberRestrictionEvaluation", required=true)
    private MembershipRoleRestrictionEvaluationResponse memberRestrictionEvaluation;

    public MembershipRoleRestrictionEvaluationResponse memberRestrictionEvaluation() {
        return this.memberRestrictionEvaluation;
    }

    private RestrictionEvaluationsResponse() {}

    private RestrictionEvaluationsResponse(RestrictionEvaluationsResponse $) {
        this.memberRestrictionEvaluation = $.memberRestrictionEvaluation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestrictionEvaluationsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestrictionEvaluationsResponse $;

        public Builder() {
            $ = new RestrictionEvaluationsResponse();
        }

        public Builder(RestrictionEvaluationsResponse defaults) {
            $ = new RestrictionEvaluationsResponse(Objects.requireNonNull(defaults));
        }

        public Builder memberRestrictionEvaluation(MembershipRoleRestrictionEvaluationResponse memberRestrictionEvaluation) {
            $.memberRestrictionEvaluation = memberRestrictionEvaluation;
            return this;
        }

        public RestrictionEvaluationsResponse build() {
            $.memberRestrictionEvaluation = Objects.requireNonNull($.memberRestrictionEvaluation, "expected parameter 'memberRestrictionEvaluation' to be non-null");
            return $;
        }
    }

}
