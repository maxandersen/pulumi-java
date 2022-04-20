// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.jobs_v3.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.jobs_v3.inputs.CompensationEntryResponse;
import com.pulumi.googlenative.jobs_v3.inputs.CompensationRangeResponse;
import java.util.List;
import java.util.Objects;


/**
 * Job compensation details.
 * 
 */
public final class CompensationInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final CompensationInfoResponse Empty = new CompensationInfoResponse();

    /**
     * Annualized base compensation range. Computed as base compensation entry&#39;s CompensationEntry.compensation times CompensationEntry.expected_units_per_year. See CompensationEntry for explanation on compensation annualization.
     * 
     */
    @Import(name="annualizedBaseCompensationRange", required=true)
      private final CompensationRangeResponse annualizedBaseCompensationRange;

    public CompensationRangeResponse annualizedBaseCompensationRange() {
        return this.annualizedBaseCompensationRange;
    }

    /**
     * Annualized total compensation range. Computed as all compensation entries&#39; CompensationEntry.compensation times CompensationEntry.expected_units_per_year. See CompensationEntry for explanation on compensation annualization.
     * 
     */
    @Import(name="annualizedTotalCompensationRange", required=true)
      private final CompensationRangeResponse annualizedTotalCompensationRange;

    public CompensationRangeResponse annualizedTotalCompensationRange() {
        return this.annualizedTotalCompensationRange;
    }

    /**
     * Optional. Job compensation information. At most one entry can be of type CompensationInfo.CompensationType.BASE, which is referred as ** base compensation entry ** for the job.
     * 
     */
    @Import(name="entries", required=true)
      private final List<CompensationEntryResponse> entries;

    public List<CompensationEntryResponse> entries() {
        return this.entries;
    }

    public CompensationInfoResponse(
        CompensationRangeResponse annualizedBaseCompensationRange,
        CompensationRangeResponse annualizedTotalCompensationRange,
        List<CompensationEntryResponse> entries) {
        this.annualizedBaseCompensationRange = Objects.requireNonNull(annualizedBaseCompensationRange, "expected parameter 'annualizedBaseCompensationRange' to be non-null");
        this.annualizedTotalCompensationRange = Objects.requireNonNull(annualizedTotalCompensationRange, "expected parameter 'annualizedTotalCompensationRange' to be non-null");
        this.entries = Objects.requireNonNull(entries, "expected parameter 'entries' to be non-null");
    }

    private CompensationInfoResponse() {
        this.annualizedBaseCompensationRange = null;
        this.annualizedTotalCompensationRange = null;
        this.entries = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompensationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CompensationRangeResponse annualizedBaseCompensationRange;
        private CompensationRangeResponse annualizedTotalCompensationRange;
        private List<CompensationEntryResponse> entries;

        public Builder() {
    	      // Empty
        }

        public Builder(CompensationInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annualizedBaseCompensationRange = defaults.annualizedBaseCompensationRange;
    	      this.annualizedTotalCompensationRange = defaults.annualizedTotalCompensationRange;
    	      this.entries = defaults.entries;
        }

        public Builder annualizedBaseCompensationRange(CompensationRangeResponse annualizedBaseCompensationRange) {
            this.annualizedBaseCompensationRange = Objects.requireNonNull(annualizedBaseCompensationRange);
            return this;
        }
        public Builder annualizedTotalCompensationRange(CompensationRangeResponse annualizedTotalCompensationRange) {
            this.annualizedTotalCompensationRange = Objects.requireNonNull(annualizedTotalCompensationRange);
            return this;
        }
        public Builder entries(List<CompensationEntryResponse> entries) {
            this.entries = Objects.requireNonNull(entries);
            return this;
        }
        public Builder entries(CompensationEntryResponse... entries) {
            return entries(List.of(entries));
        }        public CompensationInfoResponse build() {
            return new CompensationInfoResponse(annualizedBaseCompensationRange, annualizedTotalCompensationRange, entries);
        }
    }
}
