// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.cloudidentity_v1beta1.inputs.MembershipRoleRestrictionEvaluationResponse;
import java.util.Objects;


/**
 * Evaluations of restrictions applied to parent group on this membership.
 * 
 */
public final class RestrictionEvaluationsResponse extends io.pulumi.resources.InvokeArgs {

    public static final RestrictionEvaluationsResponse Empty = new RestrictionEvaluationsResponse();

    /**
     * Evaluation of the member restriction applied to this membership. Empty if the user lacks permission to view the restriction evaluation.
     * 
     */
    @Import(name="memberRestrictionEvaluation", required=true)
      private final MembershipRoleRestrictionEvaluationResponse memberRestrictionEvaluation;

    public MembershipRoleRestrictionEvaluationResponse memberRestrictionEvaluation() {
        return this.memberRestrictionEvaluation;
    }

    public RestrictionEvaluationsResponse(MembershipRoleRestrictionEvaluationResponse memberRestrictionEvaluation) {
        this.memberRestrictionEvaluation = Objects.requireNonNull(memberRestrictionEvaluation, "expected parameter 'memberRestrictionEvaluation' to be non-null");
    }

    private RestrictionEvaluationsResponse() {
        this.memberRestrictionEvaluation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestrictionEvaluationsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MembershipRoleRestrictionEvaluationResponse memberRestrictionEvaluation;

        public Builder() {
    	      // Empty
        }

        public Builder(RestrictionEvaluationsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memberRestrictionEvaluation = defaults.memberRestrictionEvaluation;
        }

        public Builder memberRestrictionEvaluation(MembershipRoleRestrictionEvaluationResponse memberRestrictionEvaluation) {
            this.memberRestrictionEvaluation = Objects.requireNonNull(memberRestrictionEvaluation);
            return this;
        }        public RestrictionEvaluationsResponse build() {
            return new RestrictionEvaluationsResponse(memberRestrictionEvaluation);
        }
    }
}
