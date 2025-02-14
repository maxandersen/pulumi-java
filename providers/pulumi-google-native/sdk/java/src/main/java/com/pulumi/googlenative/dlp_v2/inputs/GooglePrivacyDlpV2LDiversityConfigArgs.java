// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * l-diversity metric, used for analysis of reidentification risk.
 * 
 */
public final class GooglePrivacyDlpV2LDiversityConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2LDiversityConfigArgs Empty = new GooglePrivacyDlpV2LDiversityConfigArgs();

    /**
     * Set of quasi-identifiers indicating how equivalence classes are defined for the l-diversity computation. When multiple fields are specified, they are considered a single composite key.
     * 
     */
    @Import(name="quasiIds")
    private @Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> quasiIds;

    /**
     * @return Set of quasi-identifiers indicating how equivalence classes are defined for the l-diversity computation. When multiple fields are specified, they are considered a single composite key.
     * 
     */
    public Optional<Output<List<GooglePrivacyDlpV2FieldIdArgs>>> quasiIds() {
        return Optional.ofNullable(this.quasiIds);
    }

    /**
     * Sensitive field for computing the l-value.
     * 
     */
    @Import(name="sensitiveAttribute")
    private @Nullable Output<GooglePrivacyDlpV2FieldIdArgs> sensitiveAttribute;

    /**
     * @return Sensitive field for computing the l-value.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2FieldIdArgs>> sensitiveAttribute() {
        return Optional.ofNullable(this.sensitiveAttribute);
    }

    private GooglePrivacyDlpV2LDiversityConfigArgs() {}

    private GooglePrivacyDlpV2LDiversityConfigArgs(GooglePrivacyDlpV2LDiversityConfigArgs $) {
        this.quasiIds = $.quasiIds;
        this.sensitiveAttribute = $.sensitiveAttribute;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2LDiversityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2LDiversityConfigArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2LDiversityConfigArgs();
        }

        public Builder(GooglePrivacyDlpV2LDiversityConfigArgs defaults) {
            $ = new GooglePrivacyDlpV2LDiversityConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param quasiIds Set of quasi-identifiers indicating how equivalence classes are defined for the l-diversity computation. When multiple fields are specified, they are considered a single composite key.
         * 
         * @return builder
         * 
         */
        public Builder quasiIds(@Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> quasiIds) {
            $.quasiIds = quasiIds;
            return this;
        }

        /**
         * @param quasiIds Set of quasi-identifiers indicating how equivalence classes are defined for the l-diversity computation. When multiple fields are specified, they are considered a single composite key.
         * 
         * @return builder
         * 
         */
        public Builder quasiIds(List<GooglePrivacyDlpV2FieldIdArgs> quasiIds) {
            return quasiIds(Output.of(quasiIds));
        }

        /**
         * @param quasiIds Set of quasi-identifiers indicating how equivalence classes are defined for the l-diversity computation. When multiple fields are specified, they are considered a single composite key.
         * 
         * @return builder
         * 
         */
        public Builder quasiIds(GooglePrivacyDlpV2FieldIdArgs... quasiIds) {
            return quasiIds(List.of(quasiIds));
        }

        /**
         * @param sensitiveAttribute Sensitive field for computing the l-value.
         * 
         * @return builder
         * 
         */
        public Builder sensitiveAttribute(@Nullable Output<GooglePrivacyDlpV2FieldIdArgs> sensitiveAttribute) {
            $.sensitiveAttribute = sensitiveAttribute;
            return this;
        }

        /**
         * @param sensitiveAttribute Sensitive field for computing the l-value.
         * 
         * @return builder
         * 
         */
        public Builder sensitiveAttribute(GooglePrivacyDlpV2FieldIdArgs sensitiveAttribute) {
            return sensitiveAttribute(Output.of(sensitiveAttribute));
        }

        public GooglePrivacyDlpV2LDiversityConfigArgs build() {
            return $;
        }
    }

}
