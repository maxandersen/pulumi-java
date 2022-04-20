// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.AttestationAuthorityHintResponse;
import java.util.Objects;


/**
 * Note kind that represents a logical attestation &#34;role&#34; or &#34;authority&#34;. For example, an organization might have one `AttestationAuthority` for &#34;QA&#34; and one for &#34;build&#34;. This Note is intended to act strictly as a grouping mechanism for the attached Occurrences (Attestations). This grouping mechanism also provides a security boundary, since IAM ACLs gate the ability for a principle to attach an Occurrence to a given Note. It also provides a single point of lookup to find all attached Attestation Occurrences, even if they don&#39;t all live in the same project.
 * 
 */
public final class AttestationAuthorityResponse extends com.pulumi.resources.InvokeArgs {

    public static final AttestationAuthorityResponse Empty = new AttestationAuthorityResponse();

    @Import(name="hint", required=true)
      private final AttestationAuthorityHintResponse hint;

    public AttestationAuthorityHintResponse hint() {
        return this.hint;
    }

    public AttestationAuthorityResponse(AttestationAuthorityHintResponse hint) {
        this.hint = Objects.requireNonNull(hint, "expected parameter 'hint' to be non-null");
    }

    private AttestationAuthorityResponse() {
        this.hint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestationAuthorityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttestationAuthorityHintResponse hint;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestationAuthorityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hint = defaults.hint;
        }

        public Builder hint(AttestationAuthorityHintResponse hint) {
            this.hint = Objects.requireNonNull(hint);
            return this;
        }        public AttestationAuthorityResponse build() {
            return new AttestationAuthorityResponse(hint);
        }
    }
}
