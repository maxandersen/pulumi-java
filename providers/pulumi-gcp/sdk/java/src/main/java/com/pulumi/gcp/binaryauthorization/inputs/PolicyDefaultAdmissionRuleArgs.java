// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.binaryauthorization.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyDefaultAdmissionRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyDefaultAdmissionRuleArgs Empty = new PolicyDefaultAdmissionRuleArgs();

    /**
     * The action when a pod creation is denied by the admission rule.
     * Possible values are `ENFORCED_BLOCK_AND_AUDIT_LOG` and `DRYRUN_AUDIT_LOG_ONLY`.
     * 
     */
    @Import(name="enforcementMode", required=true)
    private Output<String> enforcementMode;

    public Output<String> enforcementMode() {
        return this.enforcementMode;
    }

    /**
     * How this admission rule will be evaluated.
     * Possible values are `ALWAYS_ALLOW`, `REQUIRE_ATTESTATION`, and `ALWAYS_DENY`.
     * 
     */
    @Import(name="evaluationMode", required=true)
    private Output<String> evaluationMode;

    public Output<String> evaluationMode() {
        return this.evaluationMode;
    }

    /**
     * The resource names of the attestors that must attest to a
     * container image. If the attestor is in a different project from the
     * policy, it should be specified in the format `projects/*{@literal /}attestors/*`.
     * Each attestor must exist before a policy can reference it. To add an
     * attestor to a policy the principal issuing the policy change
     * request must be able to read the attestor resource.
     * Note: this field must be non-empty when the evaluation_mode field
     * specifies REQUIRE_ATTESTATION, otherwise it must be empty.
     * 
     */
    @Import(name="requireAttestationsBies")
    private @Nullable Output<List<String>> requireAttestationsBies;

    public Optional<Output<List<String>>> requireAttestationsBies() {
        return Optional.ofNullable(this.requireAttestationsBies);
    }

    private PolicyDefaultAdmissionRuleArgs() {}

    private PolicyDefaultAdmissionRuleArgs(PolicyDefaultAdmissionRuleArgs $) {
        this.enforcementMode = $.enforcementMode;
        this.evaluationMode = $.evaluationMode;
        this.requireAttestationsBies = $.requireAttestationsBies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyDefaultAdmissionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyDefaultAdmissionRuleArgs $;

        public Builder() {
            $ = new PolicyDefaultAdmissionRuleArgs();
        }

        public Builder(PolicyDefaultAdmissionRuleArgs defaults) {
            $ = new PolicyDefaultAdmissionRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder enforcementMode(Output<String> enforcementMode) {
            $.enforcementMode = enforcementMode;
            return this;
        }

        public Builder enforcementMode(String enforcementMode) {
            return enforcementMode(Output.of(enforcementMode));
        }

        public Builder evaluationMode(Output<String> evaluationMode) {
            $.evaluationMode = evaluationMode;
            return this;
        }

        public Builder evaluationMode(String evaluationMode) {
            return evaluationMode(Output.of(evaluationMode));
        }

        public Builder requireAttestationsBies(@Nullable Output<List<String>> requireAttestationsBies) {
            $.requireAttestationsBies = requireAttestationsBies;
            return this;
        }

        public Builder requireAttestationsBies(List<String> requireAttestationsBies) {
            return requireAttestationsBies(Output.of(requireAttestationsBies));
        }

        public Builder requireAttestationsBies(String... requireAttestationsBies) {
            return requireAttestationsBies(List.of(requireAttestationsBies));
        }

        public PolicyDefaultAdmissionRuleArgs build() {
            $.enforcementMode = Objects.requireNonNull($.enforcementMode, "expected parameter 'enforcementMode' to be non-null");
            $.evaluationMode = Objects.requireNonNull($.evaluationMode, "expected parameter 'evaluationMode' to be non-null");
            return $;
        }
    }

}
