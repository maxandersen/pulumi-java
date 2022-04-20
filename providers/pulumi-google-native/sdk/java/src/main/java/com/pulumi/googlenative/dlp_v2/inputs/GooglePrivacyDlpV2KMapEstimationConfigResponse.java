// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2AuxiliaryTableResponse;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2TaggedFieldResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Reidentifiability metric. This corresponds to a risk model similar to what is called &#34;journalist risk&#34; in the literature, except the attack dataset is statistically modeled instead of being perfectly known. This can be done using publicly available data (like the US Census), or using a custom statistical model (indicated as one or several BigQuery tables), or by extrapolating from the distribution of values in the input dataset.
 * 
 */
public final class GooglePrivacyDlpV2KMapEstimationConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2KMapEstimationConfigResponse Empty = new GooglePrivacyDlpV2KMapEstimationConfigResponse();

    /**
     * Several auxiliary tables can be used in the analysis. Each custom_tag used to tag a quasi-identifiers column must appear in exactly one column of one auxiliary table.
     * 
     */
    @Import(name="auxiliaryTables", required=true)
      private final List<GooglePrivacyDlpV2AuxiliaryTableResponse> auxiliaryTables;

    public List<GooglePrivacyDlpV2AuxiliaryTableResponse> auxiliaryTables() {
        return this.auxiliaryTables;
    }

    /**
     * Fields considered to be quasi-identifiers. No two columns can have the same tag.
     * 
     */
    @Import(name="quasiIds", required=true)
      private final List<GooglePrivacyDlpV2TaggedFieldResponse> quasiIds;

    public List<GooglePrivacyDlpV2TaggedFieldResponse> quasiIds() {
        return this.quasiIds;
    }

    /**
     * ISO 3166-1 alpha-2 region code to use in the statistical modeling. Set if no column is tagged with a region-specific InfoType (like US_ZIP_5) or a region code.
     * 
     */
    @Import(name="regionCode", required=true)
      private final String regionCode;

    public String regionCode() {
        return this.regionCode;
    }

    public GooglePrivacyDlpV2KMapEstimationConfigResponse(
        List<GooglePrivacyDlpV2AuxiliaryTableResponse> auxiliaryTables,
        List<GooglePrivacyDlpV2TaggedFieldResponse> quasiIds,
        String regionCode) {
        this.auxiliaryTables = Objects.requireNonNull(auxiliaryTables, "expected parameter 'auxiliaryTables' to be non-null");
        this.quasiIds = Objects.requireNonNull(quasiIds, "expected parameter 'quasiIds' to be non-null");
        this.regionCode = Objects.requireNonNull(regionCode, "expected parameter 'regionCode' to be non-null");
    }

    private GooglePrivacyDlpV2KMapEstimationConfigResponse() {
        this.auxiliaryTables = List.of();
        this.quasiIds = List.of();
        this.regionCode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2KMapEstimationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2AuxiliaryTableResponse> auxiliaryTables;
        private List<GooglePrivacyDlpV2TaggedFieldResponse> quasiIds;
        private String regionCode;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2KMapEstimationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auxiliaryTables = defaults.auxiliaryTables;
    	      this.quasiIds = defaults.quasiIds;
    	      this.regionCode = defaults.regionCode;
        }

        public Builder auxiliaryTables(List<GooglePrivacyDlpV2AuxiliaryTableResponse> auxiliaryTables) {
            this.auxiliaryTables = Objects.requireNonNull(auxiliaryTables);
            return this;
        }
        public Builder auxiliaryTables(GooglePrivacyDlpV2AuxiliaryTableResponse... auxiliaryTables) {
            return auxiliaryTables(List.of(auxiliaryTables));
        }
        public Builder quasiIds(List<GooglePrivacyDlpV2TaggedFieldResponse> quasiIds) {
            this.quasiIds = Objects.requireNonNull(quasiIds);
            return this;
        }
        public Builder quasiIds(GooglePrivacyDlpV2TaggedFieldResponse... quasiIds) {
            return quasiIds(List.of(quasiIds));
        }
        public Builder regionCode(String regionCode) {
            this.regionCode = Objects.requireNonNull(regionCode);
            return this;
        }        public GooglePrivacyDlpV2KMapEstimationConfigResponse build() {
            return new GooglePrivacyDlpV2KMapEstimationConfigResponse(auxiliaryTables, quasiIds, regionCode);
        }
    }
}
