// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Upgrade Distribution represents metadata about the Upgrade for each operating system (CPE). Some distributions have additional metadata around updates, classifying them into various categories and severities.
 * 
 */
public final class UpgradeDistributionArgs extends com.pulumi.resources.ResourceArgs {

    public static final UpgradeDistributionArgs Empty = new UpgradeDistributionArgs();

    /**
     * The operating system classification of this Upgrade, as specified by the upstream operating system upgrade feed.
     * 
     */
    @Import(name="classification")
    private @Nullable Output<String> classification;

    public Optional<Output<String>> classification() {
        return Optional.ofNullable(this.classification);
    }

    /**
     * Required - The specific operating system this metadata applies to. See https://cpe.mitre.org/specification/.
     * 
     */
    @Import(name="cpeUri")
    private @Nullable Output<String> cpeUri;

    public Optional<Output<String>> cpeUri() {
        return Optional.ofNullable(this.cpeUri);
    }

    /**
     * The cve that would be resolved by this upgrade.
     * 
     */
    @Import(name="cve")
    private @Nullable Output<List<String>> cve;

    public Optional<Output<List<String>>> cve() {
        return Optional.ofNullable(this.cve);
    }

    /**
     * The severity as specified by the upstream operating system.
     * 
     */
    @Import(name="severity")
    private @Nullable Output<String> severity;

    public Optional<Output<String>> severity() {
        return Optional.ofNullable(this.severity);
    }

    private UpgradeDistributionArgs() {}

    private UpgradeDistributionArgs(UpgradeDistributionArgs $) {
        this.classification = $.classification;
        this.cpeUri = $.cpeUri;
        this.cve = $.cve;
        this.severity = $.severity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UpgradeDistributionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UpgradeDistributionArgs $;

        public Builder() {
            $ = new UpgradeDistributionArgs();
        }

        public Builder(UpgradeDistributionArgs defaults) {
            $ = new UpgradeDistributionArgs(Objects.requireNonNull(defaults));
        }

        public Builder classification(@Nullable Output<String> classification) {
            $.classification = classification;
            return this;
        }

        public Builder classification(String classification) {
            return classification(Output.of(classification));
        }

        public Builder cpeUri(@Nullable Output<String> cpeUri) {
            $.cpeUri = cpeUri;
            return this;
        }

        public Builder cpeUri(String cpeUri) {
            return cpeUri(Output.of(cpeUri));
        }

        public Builder cve(@Nullable Output<List<String>> cve) {
            $.cve = cve;
            return this;
        }

        public Builder cve(List<String> cve) {
            return cve(Output.of(cve));
        }

        public Builder cve(String... cve) {
            return cve(List.of(cve));
        }

        public Builder severity(@Nullable Output<String> severity) {
            $.severity = severity;
            return this;
        }

        public Builder severity(String severity) {
            return severity(Output.of(severity));
        }

        public UpgradeDistributionArgs build() {
            return $;
        }
    }

}
