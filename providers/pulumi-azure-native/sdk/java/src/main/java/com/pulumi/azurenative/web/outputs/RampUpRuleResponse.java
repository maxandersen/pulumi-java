// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RampUpRuleResponse {
    /**
     * Hostname of a slot to which the traffic will be redirected if decided to. E.g. myapp-stage.azurewebsites.net.
     * 
     */
    private final @Nullable String actionHostName;
    /**
     * Custom decision algorithm can be provided in TiPCallback site extension which URL can be specified. See TiPCallback site extension for the scaffold and contracts.
     * https://www.siteextensions.net/packages/TiPCallback/
     * 
     */
    private final @Nullable String changeDecisionCallbackUrl;
    /**
     * Specifies interval in minutes to reevaluate ReroutePercentage.
     * 
     */
    private final @Nullable Integer changeIntervalInMinutes;
    /**
     * In auto ramp up scenario this is the step to add/remove from <code>ReroutePercentage</code> until it reaches \n<code>MinReroutePercentage</code> or
     * <code>MaxReroutePercentage</code>. Site metrics are checked every N minutes specified in <code>ChangeIntervalInMinutes</code>.\nCustom decision algorithm
     * can be provided in TiPCallback site extension which URL can be specified in <code>ChangeDecisionCallbackUrl</code>.
     * 
     */
    private final @Nullable Double changeStep;
    /**
     * Specifies upper boundary below which ReroutePercentage will stay.
     * 
     */
    private final @Nullable Double maxReroutePercentage;
    /**
     * Specifies lower boundary above which ReroutePercentage will stay.
     * 
     */
    private final @Nullable Double minReroutePercentage;
    /**
     * Name of the routing rule. The recommended name would be to point to the slot which will receive the traffic in the experiment.
     * 
     */
    private final @Nullable String name;
    /**
     * Percentage of the traffic which will be redirected to <code>ActionHostName</code>.
     * 
     */
    private final @Nullable Double reroutePercentage;

    @CustomType.Constructor
    private RampUpRuleResponse(
        @CustomType.Parameter("actionHostName") @Nullable String actionHostName,
        @CustomType.Parameter("changeDecisionCallbackUrl") @Nullable String changeDecisionCallbackUrl,
        @CustomType.Parameter("changeIntervalInMinutes") @Nullable Integer changeIntervalInMinutes,
        @CustomType.Parameter("changeStep") @Nullable Double changeStep,
        @CustomType.Parameter("maxReroutePercentage") @Nullable Double maxReroutePercentage,
        @CustomType.Parameter("minReroutePercentage") @Nullable Double minReroutePercentage,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("reroutePercentage") @Nullable Double reroutePercentage) {
        this.actionHostName = actionHostName;
        this.changeDecisionCallbackUrl = changeDecisionCallbackUrl;
        this.changeIntervalInMinutes = changeIntervalInMinutes;
        this.changeStep = changeStep;
        this.maxReroutePercentage = maxReroutePercentage;
        this.minReroutePercentage = minReroutePercentage;
        this.name = name;
        this.reroutePercentage = reroutePercentage;
    }

    /**
     * Hostname of a slot to which the traffic will be redirected if decided to. E.g. myapp-stage.azurewebsites.net.
     * 
    */
    public Optional<String> actionHostName() {
        return Optional.ofNullable(this.actionHostName);
    }
    /**
     * Custom decision algorithm can be provided in TiPCallback site extension which URL can be specified. See TiPCallback site extension for the scaffold and contracts.
     * https://www.siteextensions.net/packages/TiPCallback/
     * 
    */
    public Optional<String> changeDecisionCallbackUrl() {
        return Optional.ofNullable(this.changeDecisionCallbackUrl);
    }
    /**
     * Specifies interval in minutes to reevaluate ReroutePercentage.
     * 
    */
    public Optional<Integer> changeIntervalInMinutes() {
        return Optional.ofNullable(this.changeIntervalInMinutes);
    }
    /**
     * In auto ramp up scenario this is the step to add/remove from <code>ReroutePercentage</code> until it reaches \n<code>MinReroutePercentage</code> or
     * <code>MaxReroutePercentage</code>. Site metrics are checked every N minutes specified in <code>ChangeIntervalInMinutes</code>.\nCustom decision algorithm
     * can be provided in TiPCallback site extension which URL can be specified in <code>ChangeDecisionCallbackUrl</code>.
     * 
    */
    public Optional<Double> changeStep() {
        return Optional.ofNullable(this.changeStep);
    }
    /**
     * Specifies upper boundary below which ReroutePercentage will stay.
     * 
    */
    public Optional<Double> maxReroutePercentage() {
        return Optional.ofNullable(this.maxReroutePercentage);
    }
    /**
     * Specifies lower boundary above which ReroutePercentage will stay.
     * 
    */
    public Optional<Double> minReroutePercentage() {
        return Optional.ofNullable(this.minReroutePercentage);
    }
    /**
     * Name of the routing rule. The recommended name would be to point to the slot which will receive the traffic in the experiment.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Percentage of the traffic which will be redirected to <code>ActionHostName</code>.
     * 
    */
    public Optional<Double> reroutePercentage() {
        return Optional.ofNullable(this.reroutePercentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RampUpRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionHostName;
        private @Nullable String changeDecisionCallbackUrl;
        private @Nullable Integer changeIntervalInMinutes;
        private @Nullable Double changeStep;
        private @Nullable Double maxReroutePercentage;
        private @Nullable Double minReroutePercentage;
        private @Nullable String name;
        private @Nullable Double reroutePercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(RampUpRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionHostName = defaults.actionHostName;
    	      this.changeDecisionCallbackUrl = defaults.changeDecisionCallbackUrl;
    	      this.changeIntervalInMinutes = defaults.changeIntervalInMinutes;
    	      this.changeStep = defaults.changeStep;
    	      this.maxReroutePercentage = defaults.maxReroutePercentage;
    	      this.minReroutePercentage = defaults.minReroutePercentage;
    	      this.name = defaults.name;
    	      this.reroutePercentage = defaults.reroutePercentage;
        }

        public Builder actionHostName(@Nullable String actionHostName) {
            this.actionHostName = actionHostName;
            return this;
        }
        public Builder changeDecisionCallbackUrl(@Nullable String changeDecisionCallbackUrl) {
            this.changeDecisionCallbackUrl = changeDecisionCallbackUrl;
            return this;
        }
        public Builder changeIntervalInMinutes(@Nullable Integer changeIntervalInMinutes) {
            this.changeIntervalInMinutes = changeIntervalInMinutes;
            return this;
        }
        public Builder changeStep(@Nullable Double changeStep) {
            this.changeStep = changeStep;
            return this;
        }
        public Builder maxReroutePercentage(@Nullable Double maxReroutePercentage) {
            this.maxReroutePercentage = maxReroutePercentage;
            return this;
        }
        public Builder minReroutePercentage(@Nullable Double minReroutePercentage) {
            this.minReroutePercentage = minReroutePercentage;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder reroutePercentage(@Nullable Double reroutePercentage) {
            this.reroutePercentage = reroutePercentage;
            return this;
        }        public RampUpRuleResponse build() {
            return new RampUpRuleResponse(actionHostName, changeDecisionCallbackUrl, changeIntervalInMinutes, changeStep, maxReroutePercentage, minReroutePercentage, name, reroutePercentage);
        }
    }
}
