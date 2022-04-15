// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Sku change info of account.
 * 
 */
public final class CognitiveServicesAccountSkuChangeInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final CognitiveServicesAccountSkuChangeInfoResponse Empty = new CognitiveServicesAccountSkuChangeInfoResponse();

    /**
     * Gets the count of downgrades.
     * 
     */
    @Import(name="countOfDowngrades", required=true)
      private final Double countOfDowngrades;

    public Double countOfDowngrades() {
        return this.countOfDowngrades;
    }

    /**
     * Gets the count of upgrades after downgrades.
     * 
     */
    @Import(name="countOfUpgradesAfterDowngrades", required=true)
      private final Double countOfUpgradesAfterDowngrades;

    public Double countOfUpgradesAfterDowngrades() {
        return this.countOfUpgradesAfterDowngrades;
    }

    /**
     * Gets the last change date.
     * 
     */
    @Import(name="lastChangeDate", required=true)
      private final String lastChangeDate;

    public String lastChangeDate() {
        return this.lastChangeDate;
    }

    public CognitiveServicesAccountSkuChangeInfoResponse(
        Double countOfDowngrades,
        Double countOfUpgradesAfterDowngrades,
        String lastChangeDate) {
        this.countOfDowngrades = Objects.requireNonNull(countOfDowngrades, "expected parameter 'countOfDowngrades' to be non-null");
        this.countOfUpgradesAfterDowngrades = Objects.requireNonNull(countOfUpgradesAfterDowngrades, "expected parameter 'countOfUpgradesAfterDowngrades' to be non-null");
        this.lastChangeDate = Objects.requireNonNull(lastChangeDate, "expected parameter 'lastChangeDate' to be non-null");
    }

    private CognitiveServicesAccountSkuChangeInfoResponse() {
        this.countOfDowngrades = null;
        this.countOfUpgradesAfterDowngrades = null;
        this.lastChangeDate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CognitiveServicesAccountSkuChangeInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double countOfDowngrades;
        private Double countOfUpgradesAfterDowngrades;
        private String lastChangeDate;

        public Builder() {
    	      // Empty
        }

        public Builder(CognitiveServicesAccountSkuChangeInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countOfDowngrades = defaults.countOfDowngrades;
    	      this.countOfUpgradesAfterDowngrades = defaults.countOfUpgradesAfterDowngrades;
    	      this.lastChangeDate = defaults.lastChangeDate;
        }

        public Builder countOfDowngrades(Double countOfDowngrades) {
            this.countOfDowngrades = Objects.requireNonNull(countOfDowngrades);
            return this;
        }
        public Builder countOfUpgradesAfterDowngrades(Double countOfUpgradesAfterDowngrades) {
            this.countOfUpgradesAfterDowngrades = Objects.requireNonNull(countOfUpgradesAfterDowngrades);
            return this;
        }
        public Builder lastChangeDate(String lastChangeDate) {
            this.lastChangeDate = Objects.requireNonNull(lastChangeDate);
            return this;
        }        public CognitiveServicesAccountSkuChangeInfoResponse build() {
            return new CognitiveServicesAccountSkuChangeInfoResponse(countOfDowngrades, countOfUpgradesAfterDowngrades, lastChangeDate);
        }
    }
}
