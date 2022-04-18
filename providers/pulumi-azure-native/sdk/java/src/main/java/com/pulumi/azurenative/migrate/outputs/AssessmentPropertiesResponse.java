// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.outputs;

import com.pulumi.azurenative.migrate.outputs.VmUptimeResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AssessmentPropertiesResponse {
    /**
     * Storage type selected for this disk.
     * 
     */
    private final String azureDiskType;
    /**
     * AHUB discount on windows virtual machines.
     * 
     */
    private final String azureHybridUseBenefit;
    /**
     * Target Azure location for which the machines should be assessed. These enums are the same as used by Compute API.
     * 
     */
    private final String azureLocation;
    /**
     * Offer code according to which cost estimation is done.
     * 
     */
    private final String azureOfferCode;
    /**
     * Pricing tier for Size evaluation.
     * 
     */
    private final String azurePricingTier;
    /**
     * Storage Redundancy type offered by Azure.
     * 
     */
    private final String azureStorageRedundancy;
    /**
     * List of azure VM families.
     * 
     */
    private final List<String> azureVmFamilies;
    /**
     * Confidence rating percentage for assessment. Can be in the range [0, 100].
     * 
     */
    private final Double confidenceRatingInPercentage;
    /**
     * Time when this project was created. Date-Time represented in ISO-8601 format.
     * 
     */
    private final String createdTimestamp;
    /**
     * Currency to report prices in.
     * 
     */
    private final String currency;
    /**
     * Custom discount percentage to be applied on final costs. Can be in the range [0, 100].
     * 
     */
    private final Double discountPercentage;
    /**
     * Enterprise agreement subscription arm id.
     * 
     */
    private final String eaSubscriptionId;
    /**
     * Monthly network cost estimate for the machines that are part of this assessment as a group, for a 31-day month.
     * 
     */
    private final Double monthlyBandwidthCost;
    /**
     * Monthly compute cost estimate for the machines that are part of this assessment as a group, for a 31-day month.
     * 
     */
    private final Double monthlyComputeCost;
    /**
     * Monthly premium storage cost estimate for the machines that are part of this assessment as a group, for a 31-day month.
     * 
     */
    private final Double monthlyPremiumStorageCost;
    /**
     * Monthly standard SSD storage cost estimate for the machines that are part of this assessment as a group, for a 31-day month.
     * 
     */
    private final Double monthlyStandardSSDStorageCost;
    /**
     * Monthly storage cost estimate for the machines that are part of this assessment as a group, for a 31-day month.
     * 
     */
    private final Double monthlyStorageCost;
    /**
     * Number of assessed machines part of this assessment.
     * 
     */
    private final Integer numberOfMachines;
    /**
     * Percentile of performance data used to recommend Azure size.
     * 
     */
    private final String percentile;
    /**
     * End time to consider performance data for assessment
     * 
     */
    private final String perfDataEndTime;
    /**
     * Start time to consider performance data for assessment
     * 
     */
    private final String perfDataStartTime;
    /**
     * Time when the Azure Prices were queried. Date-Time represented in ISO-8601 format.
     * 
     */
    private final String pricesTimestamp;
    /**
     * Azure reserved instance.
     * 
     */
    private final String reservedInstance;
    /**
     * Scaling factor used over utilization data to add a performance buffer for new machines to be created in Azure. Min Value = 1.0, Max value = 1.9, Default = 1.3.
     * 
     */
    private final Double scalingFactor;
    /**
     * Assessment sizing criterion.
     * 
     */
    private final String sizingCriterion;
    /**
     * User configurable setting that describes the status of the assessment.
     * 
     */
    private final String stage;
    /**
     * Whether the assessment has been created and is valid.
     * 
     */
    private final String status;
    /**
     * Time range of performance data used to recommend a size.
     * 
     */
    private final String timeRange;
    /**
     * Time when this project was last updated. Date-Time represented in ISO-8601 format.
     * 
     */
    private final String updatedTimestamp;
    /**
     * Specify the duration for which the VMs are up in the on-premises environment.
     * 
     */
    private final VmUptimeResponse vmUptime;

    @CustomType.Constructor
    private AssessmentPropertiesResponse(
        @CustomType.Parameter("azureDiskType") String azureDiskType,
        @CustomType.Parameter("azureHybridUseBenefit") String azureHybridUseBenefit,
        @CustomType.Parameter("azureLocation") String azureLocation,
        @CustomType.Parameter("azureOfferCode") String azureOfferCode,
        @CustomType.Parameter("azurePricingTier") String azurePricingTier,
        @CustomType.Parameter("azureStorageRedundancy") String azureStorageRedundancy,
        @CustomType.Parameter("azureVmFamilies") List<String> azureVmFamilies,
        @CustomType.Parameter("confidenceRatingInPercentage") Double confidenceRatingInPercentage,
        @CustomType.Parameter("createdTimestamp") String createdTimestamp,
        @CustomType.Parameter("currency") String currency,
        @CustomType.Parameter("discountPercentage") Double discountPercentage,
        @CustomType.Parameter("eaSubscriptionId") String eaSubscriptionId,
        @CustomType.Parameter("monthlyBandwidthCost") Double monthlyBandwidthCost,
        @CustomType.Parameter("monthlyComputeCost") Double monthlyComputeCost,
        @CustomType.Parameter("monthlyPremiumStorageCost") Double monthlyPremiumStorageCost,
        @CustomType.Parameter("monthlyStandardSSDStorageCost") Double monthlyStandardSSDStorageCost,
        @CustomType.Parameter("monthlyStorageCost") Double monthlyStorageCost,
        @CustomType.Parameter("numberOfMachines") Integer numberOfMachines,
        @CustomType.Parameter("percentile") String percentile,
        @CustomType.Parameter("perfDataEndTime") String perfDataEndTime,
        @CustomType.Parameter("perfDataStartTime") String perfDataStartTime,
        @CustomType.Parameter("pricesTimestamp") String pricesTimestamp,
        @CustomType.Parameter("reservedInstance") String reservedInstance,
        @CustomType.Parameter("scalingFactor") Double scalingFactor,
        @CustomType.Parameter("sizingCriterion") String sizingCriterion,
        @CustomType.Parameter("stage") String stage,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("timeRange") String timeRange,
        @CustomType.Parameter("updatedTimestamp") String updatedTimestamp,
        @CustomType.Parameter("vmUptime") VmUptimeResponse vmUptime) {
        this.azureDiskType = azureDiskType;
        this.azureHybridUseBenefit = azureHybridUseBenefit;
        this.azureLocation = azureLocation;
        this.azureOfferCode = azureOfferCode;
        this.azurePricingTier = azurePricingTier;
        this.azureStorageRedundancy = azureStorageRedundancy;
        this.azureVmFamilies = azureVmFamilies;
        this.confidenceRatingInPercentage = confidenceRatingInPercentage;
        this.createdTimestamp = createdTimestamp;
        this.currency = currency;
        this.discountPercentage = discountPercentage;
        this.eaSubscriptionId = eaSubscriptionId;
        this.monthlyBandwidthCost = monthlyBandwidthCost;
        this.monthlyComputeCost = monthlyComputeCost;
        this.monthlyPremiumStorageCost = monthlyPremiumStorageCost;
        this.monthlyStandardSSDStorageCost = monthlyStandardSSDStorageCost;
        this.monthlyStorageCost = monthlyStorageCost;
        this.numberOfMachines = numberOfMachines;
        this.percentile = percentile;
        this.perfDataEndTime = perfDataEndTime;
        this.perfDataStartTime = perfDataStartTime;
        this.pricesTimestamp = pricesTimestamp;
        this.reservedInstance = reservedInstance;
        this.scalingFactor = scalingFactor;
        this.sizingCriterion = sizingCriterion;
        this.stage = stage;
        this.status = status;
        this.timeRange = timeRange;
        this.updatedTimestamp = updatedTimestamp;
        this.vmUptime = vmUptime;
    }

    /**
     * Storage type selected for this disk.
     * 
    */
    public String azureDiskType() {
        return this.azureDiskType;
    }
    /**
     * AHUB discount on windows virtual machines.
     * 
    */
    public String azureHybridUseBenefit() {
        return this.azureHybridUseBenefit;
    }
    /**
     * Target Azure location for which the machines should be assessed. These enums are the same as used by Compute API.
     * 
    */
    public String azureLocation() {
        return this.azureLocation;
    }
    /**
     * Offer code according to which cost estimation is done.
     * 
    */
    public String azureOfferCode() {
        return this.azureOfferCode;
    }
    /**
     * Pricing tier for Size evaluation.
     * 
    */
    public String azurePricingTier() {
        return this.azurePricingTier;
    }
    /**
     * Storage Redundancy type offered by Azure.
     * 
    */
    public String azureStorageRedundancy() {
        return this.azureStorageRedundancy;
    }
    /**
     * List of azure VM families.
     * 
    */
    public List<String> azureVmFamilies() {
        return this.azureVmFamilies;
    }
    /**
     * Confidence rating percentage for assessment. Can be in the range [0, 100].
     * 
    */
    public Double confidenceRatingInPercentage() {
        return this.confidenceRatingInPercentage;
    }
    /**
     * Time when this project was created. Date-Time represented in ISO-8601 format.
     * 
    */
    public String createdTimestamp() {
        return this.createdTimestamp;
    }
    /**
     * Currency to report prices in.
     * 
    */
    public String currency() {
        return this.currency;
    }
    /**
     * Custom discount percentage to be applied on final costs. Can be in the range [0, 100].
     * 
    */
    public Double discountPercentage() {
        return this.discountPercentage;
    }
    /**
     * Enterprise agreement subscription arm id.
     * 
    */
    public String eaSubscriptionId() {
        return this.eaSubscriptionId;
    }
    /**
     * Monthly network cost estimate for the machines that are part of this assessment as a group, for a 31-day month.
     * 
    */
    public Double monthlyBandwidthCost() {
        return this.monthlyBandwidthCost;
    }
    /**
     * Monthly compute cost estimate for the machines that are part of this assessment as a group, for a 31-day month.
     * 
    */
    public Double monthlyComputeCost() {
        return this.monthlyComputeCost;
    }
    /**
     * Monthly premium storage cost estimate for the machines that are part of this assessment as a group, for a 31-day month.
     * 
    */
    public Double monthlyPremiumStorageCost() {
        return this.monthlyPremiumStorageCost;
    }
    /**
     * Monthly standard SSD storage cost estimate for the machines that are part of this assessment as a group, for a 31-day month.
     * 
    */
    public Double monthlyStandardSSDStorageCost() {
        return this.monthlyStandardSSDStorageCost;
    }
    /**
     * Monthly storage cost estimate for the machines that are part of this assessment as a group, for a 31-day month.
     * 
    */
    public Double monthlyStorageCost() {
        return this.monthlyStorageCost;
    }
    /**
     * Number of assessed machines part of this assessment.
     * 
    */
    public Integer numberOfMachines() {
        return this.numberOfMachines;
    }
    /**
     * Percentile of performance data used to recommend Azure size.
     * 
    */
    public String percentile() {
        return this.percentile;
    }
    /**
     * End time to consider performance data for assessment
     * 
    */
    public String perfDataEndTime() {
        return this.perfDataEndTime;
    }
    /**
     * Start time to consider performance data for assessment
     * 
    */
    public String perfDataStartTime() {
        return this.perfDataStartTime;
    }
    /**
     * Time when the Azure Prices were queried. Date-Time represented in ISO-8601 format.
     * 
    */
    public String pricesTimestamp() {
        return this.pricesTimestamp;
    }
    /**
     * Azure reserved instance.
     * 
    */
    public String reservedInstance() {
        return this.reservedInstance;
    }
    /**
     * Scaling factor used over utilization data to add a performance buffer for new machines to be created in Azure. Min Value = 1.0, Max value = 1.9, Default = 1.3.
     * 
    */
    public Double scalingFactor() {
        return this.scalingFactor;
    }
    /**
     * Assessment sizing criterion.
     * 
    */
    public String sizingCriterion() {
        return this.sizingCriterion;
    }
    /**
     * User configurable setting that describes the status of the assessment.
     * 
    */
    public String stage() {
        return this.stage;
    }
    /**
     * Whether the assessment has been created and is valid.
     * 
    */
    public String status() {
        return this.status;
    }
    /**
     * Time range of performance data used to recommend a size.
     * 
    */
    public String timeRange() {
        return this.timeRange;
    }
    /**
     * Time when this project was last updated. Date-Time represented in ISO-8601 format.
     * 
    */
    public String updatedTimestamp() {
        return this.updatedTimestamp;
    }
    /**
     * Specify the duration for which the VMs are up in the on-premises environment.
     * 
    */
    public VmUptimeResponse vmUptime() {
        return this.vmUptime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String azureDiskType;
        private String azureHybridUseBenefit;
        private String azureLocation;
        private String azureOfferCode;
        private String azurePricingTier;
        private String azureStorageRedundancy;
        private List<String> azureVmFamilies;
        private Double confidenceRatingInPercentage;
        private String createdTimestamp;
        private String currency;
        private Double discountPercentage;
        private String eaSubscriptionId;
        private Double monthlyBandwidthCost;
        private Double monthlyComputeCost;
        private Double monthlyPremiumStorageCost;
        private Double monthlyStandardSSDStorageCost;
        private Double monthlyStorageCost;
        private Integer numberOfMachines;
        private String percentile;
        private String perfDataEndTime;
        private String perfDataStartTime;
        private String pricesTimestamp;
        private String reservedInstance;
        private Double scalingFactor;
        private String sizingCriterion;
        private String stage;
        private String status;
        private String timeRange;
        private String updatedTimestamp;
        private VmUptimeResponse vmUptime;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureDiskType = defaults.azureDiskType;
    	      this.azureHybridUseBenefit = defaults.azureHybridUseBenefit;
    	      this.azureLocation = defaults.azureLocation;
    	      this.azureOfferCode = defaults.azureOfferCode;
    	      this.azurePricingTier = defaults.azurePricingTier;
    	      this.azureStorageRedundancy = defaults.azureStorageRedundancy;
    	      this.azureVmFamilies = defaults.azureVmFamilies;
    	      this.confidenceRatingInPercentage = defaults.confidenceRatingInPercentage;
    	      this.createdTimestamp = defaults.createdTimestamp;
    	      this.currency = defaults.currency;
    	      this.discountPercentage = defaults.discountPercentage;
    	      this.eaSubscriptionId = defaults.eaSubscriptionId;
    	      this.monthlyBandwidthCost = defaults.monthlyBandwidthCost;
    	      this.monthlyComputeCost = defaults.monthlyComputeCost;
    	      this.monthlyPremiumStorageCost = defaults.monthlyPremiumStorageCost;
    	      this.monthlyStandardSSDStorageCost = defaults.monthlyStandardSSDStorageCost;
    	      this.monthlyStorageCost = defaults.monthlyStorageCost;
    	      this.numberOfMachines = defaults.numberOfMachines;
    	      this.percentile = defaults.percentile;
    	      this.perfDataEndTime = defaults.perfDataEndTime;
    	      this.perfDataStartTime = defaults.perfDataStartTime;
    	      this.pricesTimestamp = defaults.pricesTimestamp;
    	      this.reservedInstance = defaults.reservedInstance;
    	      this.scalingFactor = defaults.scalingFactor;
    	      this.sizingCriterion = defaults.sizingCriterion;
    	      this.stage = defaults.stage;
    	      this.status = defaults.status;
    	      this.timeRange = defaults.timeRange;
    	      this.updatedTimestamp = defaults.updatedTimestamp;
    	      this.vmUptime = defaults.vmUptime;
        }

        public Builder azureDiskType(String azureDiskType) {
            this.azureDiskType = Objects.requireNonNull(azureDiskType);
            return this;
        }
        public Builder azureHybridUseBenefit(String azureHybridUseBenefit) {
            this.azureHybridUseBenefit = Objects.requireNonNull(azureHybridUseBenefit);
            return this;
        }
        public Builder azureLocation(String azureLocation) {
            this.azureLocation = Objects.requireNonNull(azureLocation);
            return this;
        }
        public Builder azureOfferCode(String azureOfferCode) {
            this.azureOfferCode = Objects.requireNonNull(azureOfferCode);
            return this;
        }
        public Builder azurePricingTier(String azurePricingTier) {
            this.azurePricingTier = Objects.requireNonNull(azurePricingTier);
            return this;
        }
        public Builder azureStorageRedundancy(String azureStorageRedundancy) {
            this.azureStorageRedundancy = Objects.requireNonNull(azureStorageRedundancy);
            return this;
        }
        public Builder azureVmFamilies(List<String> azureVmFamilies) {
            this.azureVmFamilies = Objects.requireNonNull(azureVmFamilies);
            return this;
        }
        public Builder azureVmFamilies(String... azureVmFamilies) {
            return azureVmFamilies(List.of(azureVmFamilies));
        }
        public Builder confidenceRatingInPercentage(Double confidenceRatingInPercentage) {
            this.confidenceRatingInPercentage = Objects.requireNonNull(confidenceRatingInPercentage);
            return this;
        }
        public Builder createdTimestamp(String createdTimestamp) {
            this.createdTimestamp = Objects.requireNonNull(createdTimestamp);
            return this;
        }
        public Builder currency(String currency) {
            this.currency = Objects.requireNonNull(currency);
            return this;
        }
        public Builder discountPercentage(Double discountPercentage) {
            this.discountPercentage = Objects.requireNonNull(discountPercentage);
            return this;
        }
        public Builder eaSubscriptionId(String eaSubscriptionId) {
            this.eaSubscriptionId = Objects.requireNonNull(eaSubscriptionId);
            return this;
        }
        public Builder monthlyBandwidthCost(Double monthlyBandwidthCost) {
            this.monthlyBandwidthCost = Objects.requireNonNull(monthlyBandwidthCost);
            return this;
        }
        public Builder monthlyComputeCost(Double monthlyComputeCost) {
            this.monthlyComputeCost = Objects.requireNonNull(monthlyComputeCost);
            return this;
        }
        public Builder monthlyPremiumStorageCost(Double monthlyPremiumStorageCost) {
            this.monthlyPremiumStorageCost = Objects.requireNonNull(monthlyPremiumStorageCost);
            return this;
        }
        public Builder monthlyStandardSSDStorageCost(Double monthlyStandardSSDStorageCost) {
            this.monthlyStandardSSDStorageCost = Objects.requireNonNull(monthlyStandardSSDStorageCost);
            return this;
        }
        public Builder monthlyStorageCost(Double monthlyStorageCost) {
            this.monthlyStorageCost = Objects.requireNonNull(monthlyStorageCost);
            return this;
        }
        public Builder numberOfMachines(Integer numberOfMachines) {
            this.numberOfMachines = Objects.requireNonNull(numberOfMachines);
            return this;
        }
        public Builder percentile(String percentile) {
            this.percentile = Objects.requireNonNull(percentile);
            return this;
        }
        public Builder perfDataEndTime(String perfDataEndTime) {
            this.perfDataEndTime = Objects.requireNonNull(perfDataEndTime);
            return this;
        }
        public Builder perfDataStartTime(String perfDataStartTime) {
            this.perfDataStartTime = Objects.requireNonNull(perfDataStartTime);
            return this;
        }
        public Builder pricesTimestamp(String pricesTimestamp) {
            this.pricesTimestamp = Objects.requireNonNull(pricesTimestamp);
            return this;
        }
        public Builder reservedInstance(String reservedInstance) {
            this.reservedInstance = Objects.requireNonNull(reservedInstance);
            return this;
        }
        public Builder scalingFactor(Double scalingFactor) {
            this.scalingFactor = Objects.requireNonNull(scalingFactor);
            return this;
        }
        public Builder sizingCriterion(String sizingCriterion) {
            this.sizingCriterion = Objects.requireNonNull(sizingCriterion);
            return this;
        }
        public Builder stage(String stage) {
            this.stage = Objects.requireNonNull(stage);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder timeRange(String timeRange) {
            this.timeRange = Objects.requireNonNull(timeRange);
            return this;
        }
        public Builder updatedTimestamp(String updatedTimestamp) {
            this.updatedTimestamp = Objects.requireNonNull(updatedTimestamp);
            return this;
        }
        public Builder vmUptime(VmUptimeResponse vmUptime) {
            this.vmUptime = Objects.requireNonNull(vmUptime);
            return this;
        }        public AssessmentPropertiesResponse build() {
            return new AssessmentPropertiesResponse(azureDiskType, azureHybridUseBenefit, azureLocation, azureOfferCode, azurePricingTier, azureStorageRedundancy, azureVmFamilies, confidenceRatingInPercentage, createdTimestamp, currency, discountPercentage, eaSubscriptionId, monthlyBandwidthCost, monthlyComputeCost, monthlyPremiumStorageCost, monthlyStandardSSDStorageCost, monthlyStorageCost, numberOfMachines, percentile, perfDataEndTime, perfDataStartTime, pricesTimestamp, reservedInstance, scalingFactor, sizingCriterion, stage, status, timeRange, updatedTimestamp, vmUptime);
        }
    }
}
