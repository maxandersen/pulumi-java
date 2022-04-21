// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.inputs;

import com.pulumi.aws.ssm.inputs.PatchBaselineApprovalRulePatchFilterGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PatchBaselineApprovalRuleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final PatchBaselineApprovalRuleGetArgs Empty = new PatchBaselineApprovalRuleGetArgs();

    /**
     * The number of days after the release date of each patch matched by the rule the patch is marked as approved in the patch baseline. Valid Range: 0 to 100. Conflicts with `approve_until_date`
     * 
     */
    @Import(name="approveAfterDays")
    private @Nullable Output<Integer> approveAfterDays;

    public Optional<Output<Integer>> approveAfterDays() {
        return Optional.ofNullable(this.approveAfterDays);
    }

    /**
     * The cutoff date for auto approval of released patches. Any patches released on or before this date are installed automatically. Date is formatted as `YYYY-MM-DD`. Conflicts with `approve_after_days`
     * 
     */
    @Import(name="approveUntilDate")
    private @Nullable Output<String> approveUntilDate;

    public Optional<Output<String>> approveUntilDate() {
        return Optional.ofNullable(this.approveUntilDate);
    }

    /**
     * Defines the compliance level for patches approved by this rule. Valid compliance levels include the following: `CRITICAL`, `HIGH`, `MEDIUM`, `LOW`, `INFORMATIONAL`, `UNSPECIFIED`. The default value is `UNSPECIFIED`.
     * 
     */
    @Import(name="complianceLevel")
    private @Nullable Output<String> complianceLevel;

    public Optional<Output<String>> complianceLevel() {
        return Optional.ofNullable(this.complianceLevel);
    }

    /**
     * Boolean enabling the application of non-security updates. The default value is &#39;false&#39;. Valid for Linux instances only.
     * 
     */
    @Import(name="enableNonSecurity")
    private @Nullable Output<Boolean> enableNonSecurity;

    public Optional<Output<Boolean>> enableNonSecurity() {
        return Optional.ofNullable(this.enableNonSecurity);
    }

    /**
     * The patch filter group that defines the criteria for the rule. Up to 5 patch filters can be specified per approval rule using Key/Value pairs. Valid Keys are `PATCH_SET | PRODUCT | CLASSIFICATION | MSRC_SEVERITY | PATCH_ID`. Valid combinations of these Keys and the `operating_system` value can be found in the [SSM DescribePatchProperties API Reference](https://docs.aws.amazon.com/systems-manager/latest/APIReference/API_DescribePatchProperties.html). Valid Values are exact values for the patch property given as the key, or a wildcard `*`, which matches all values.
     * 
     */
    @Import(name="patchFilters", required=true)
    private Output<List<PatchBaselineApprovalRulePatchFilterGetArgs>> patchFilters;

    public Output<List<PatchBaselineApprovalRulePatchFilterGetArgs>> patchFilters() {
        return this.patchFilters;
    }

    private PatchBaselineApprovalRuleGetArgs() {}

    private PatchBaselineApprovalRuleGetArgs(PatchBaselineApprovalRuleGetArgs $) {
        this.approveAfterDays = $.approveAfterDays;
        this.approveUntilDate = $.approveUntilDate;
        this.complianceLevel = $.complianceLevel;
        this.enableNonSecurity = $.enableNonSecurity;
        this.patchFilters = $.patchFilters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PatchBaselineApprovalRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PatchBaselineApprovalRuleGetArgs $;

        public Builder() {
            $ = new PatchBaselineApprovalRuleGetArgs();
        }

        public Builder(PatchBaselineApprovalRuleGetArgs defaults) {
            $ = new PatchBaselineApprovalRuleGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder approveAfterDays(@Nullable Output<Integer> approveAfterDays) {
            $.approveAfterDays = approveAfterDays;
            return this;
        }

        public Builder approveAfterDays(Integer approveAfterDays) {
            return approveAfterDays(Output.of(approveAfterDays));
        }

        public Builder approveUntilDate(@Nullable Output<String> approveUntilDate) {
            $.approveUntilDate = approveUntilDate;
            return this;
        }

        public Builder approveUntilDate(String approveUntilDate) {
            return approveUntilDate(Output.of(approveUntilDate));
        }

        public Builder complianceLevel(@Nullable Output<String> complianceLevel) {
            $.complianceLevel = complianceLevel;
            return this;
        }

        public Builder complianceLevel(String complianceLevel) {
            return complianceLevel(Output.of(complianceLevel));
        }

        public Builder enableNonSecurity(@Nullable Output<Boolean> enableNonSecurity) {
            $.enableNonSecurity = enableNonSecurity;
            return this;
        }

        public Builder enableNonSecurity(Boolean enableNonSecurity) {
            return enableNonSecurity(Output.of(enableNonSecurity));
        }

        public Builder patchFilters(Output<List<PatchBaselineApprovalRulePatchFilterGetArgs>> patchFilters) {
            $.patchFilters = patchFilters;
            return this;
        }

        public Builder patchFilters(List<PatchBaselineApprovalRulePatchFilterGetArgs> patchFilters) {
            return patchFilters(Output.of(patchFilters));
        }

        public Builder patchFilters(PatchBaselineApprovalRulePatchFilterGetArgs... patchFilters) {
            return patchFilters(List.of(patchFilters));
        }

        public PatchBaselineApprovalRuleGetArgs build() {
            $.patchFilters = Objects.requireNonNull($.patchFilters, "expected parameter 'patchFilters' to be non-null");
            return $;
        }
    }

}
