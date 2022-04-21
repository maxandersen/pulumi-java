// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights;

import com.pulumi.azurenative.customerinsights.enums.CalculationWindowTypes;
import com.pulumi.azurenative.customerinsights.enums.EntityTypes;
import com.pulumi.azurenative.customerinsights.enums.KpiFunctions;
import com.pulumi.azurenative.customerinsights.inputs.KpiAliasArgs;
import com.pulumi.azurenative.customerinsights.inputs.KpiExtractArgs;
import com.pulumi.azurenative.customerinsights.inputs.KpiThresholdsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KpiArgs extends com.pulumi.resources.ResourceArgs {

    public static final KpiArgs Empty = new KpiArgs();

    /**
     * The aliases.
     * 
     */
    @Import(name="aliases")
    private @Nullable Output<List<KpiAliasArgs>> aliases;

    public Optional<Output<List<KpiAliasArgs>>> aliases() {
        return Optional.ofNullable(this.aliases);
    }

    /**
     * The calculation window.
     * 
     */
    @Import(name="calculationWindow", required=true)
    private Output<CalculationWindowTypes> calculationWindow;

    public Output<CalculationWindowTypes> calculationWindow() {
        return this.calculationWindow;
    }

    /**
     * Name of calculation window field.
     * 
     */
    @Import(name="calculationWindowFieldName")
    private @Nullable Output<String> calculationWindowFieldName;

    public Optional<Output<String>> calculationWindowFieldName() {
        return Optional.ofNullable(this.calculationWindowFieldName);
    }

    /**
     * Localized description for the KPI.
     * 
     */
    @Import(name="description")
    private @Nullable Output<Map<String,String>> description;

    public Optional<Output<Map<String,String>>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Localized display name for the KPI.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<Map<String,String>> displayName;

    public Optional<Output<Map<String,String>>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The mapping entity type.
     * 
     */
    @Import(name="entityType", required=true)
    private Output<EntityTypes> entityType;

    public Output<EntityTypes> entityType() {
        return this.entityType;
    }

    /**
     * The mapping entity name.
     * 
     */
    @Import(name="entityTypeName", required=true)
    private Output<String> entityTypeName;

    public Output<String> entityTypeName() {
        return this.entityTypeName;
    }

    /**
     * The computation expression for the KPI.
     * 
     */
    @Import(name="expression", required=true)
    private Output<String> expression;

    public Output<String> expression() {
        return this.expression;
    }

    /**
     * The KPI extracts.
     * 
     */
    @Import(name="extracts")
    private @Nullable Output<List<KpiExtractArgs>> extracts;

    public Optional<Output<List<KpiExtractArgs>>> extracts() {
        return Optional.ofNullable(this.extracts);
    }

    /**
     * The filter expression for the KPI.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * The computation function for the KPI.
     * 
     */
    @Import(name="function", required=true)
    private Output<KpiFunctions> function;

    public Output<KpiFunctions> function() {
        return this.function;
    }

    /**
     * the group by properties for the KPI.
     * 
     */
    @Import(name="groupBy")
    private @Nullable Output<List<String>> groupBy;

    public Optional<Output<List<String>>> groupBy() {
        return Optional.ofNullable(this.groupBy);
    }

    /**
     * The name of the hub.
     * 
     */
    @Import(name="hubName", required=true)
    private Output<String> hubName;

    public Output<String> hubName() {
        return this.hubName;
    }

    /**
     * The name of the KPI.
     * 
     */
    @Import(name="kpiName")
    private @Nullable Output<String> kpiName;

    public Optional<Output<String>> kpiName() {
        return Optional.ofNullable(this.kpiName);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The KPI thresholds.
     * 
     */
    @Import(name="thresHolds")
    private @Nullable Output<KpiThresholdsArgs> thresHolds;

    public Optional<Output<KpiThresholdsArgs>> thresHolds() {
        return Optional.ofNullable(this.thresHolds);
    }

    /**
     * The unit of measurement for the KPI.
     * 
     */
    @Import(name="unit")
    private @Nullable Output<String> unit;

    public Optional<Output<String>> unit() {
        return Optional.ofNullable(this.unit);
    }

    private KpiArgs() {}

    private KpiArgs(KpiArgs $) {
        this.aliases = $.aliases;
        this.calculationWindow = $.calculationWindow;
        this.calculationWindowFieldName = $.calculationWindowFieldName;
        this.description = $.description;
        this.displayName = $.displayName;
        this.entityType = $.entityType;
        this.entityTypeName = $.entityTypeName;
        this.expression = $.expression;
        this.extracts = $.extracts;
        this.filter = $.filter;
        this.function = $.function;
        this.groupBy = $.groupBy;
        this.hubName = $.hubName;
        this.kpiName = $.kpiName;
        this.resourceGroupName = $.resourceGroupName;
        this.thresHolds = $.thresHolds;
        this.unit = $.unit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KpiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KpiArgs $;

        public Builder() {
            $ = new KpiArgs();
        }

        public Builder(KpiArgs defaults) {
            $ = new KpiArgs(Objects.requireNonNull(defaults));
        }

        public Builder aliases(@Nullable Output<List<KpiAliasArgs>> aliases) {
            $.aliases = aliases;
            return this;
        }

        public Builder aliases(List<KpiAliasArgs> aliases) {
            return aliases(Output.of(aliases));
        }

        public Builder aliases(KpiAliasArgs... aliases) {
            return aliases(List.of(aliases));
        }

        public Builder calculationWindow(Output<CalculationWindowTypes> calculationWindow) {
            $.calculationWindow = calculationWindow;
            return this;
        }

        public Builder calculationWindow(CalculationWindowTypes calculationWindow) {
            return calculationWindow(Output.of(calculationWindow));
        }

        public Builder calculationWindowFieldName(@Nullable Output<String> calculationWindowFieldName) {
            $.calculationWindowFieldName = calculationWindowFieldName;
            return this;
        }

        public Builder calculationWindowFieldName(String calculationWindowFieldName) {
            return calculationWindowFieldName(Output.of(calculationWindowFieldName));
        }

        public Builder description(@Nullable Output<Map<String,String>> description) {
            $.description = description;
            return this;
        }

        public Builder description(Map<String,String> description) {
            return description(Output.of(description));
        }

        public Builder displayName(@Nullable Output<Map<String,String>> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(Map<String,String> displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder entityType(Output<EntityTypes> entityType) {
            $.entityType = entityType;
            return this;
        }

        public Builder entityType(EntityTypes entityType) {
            return entityType(Output.of(entityType));
        }

        public Builder entityTypeName(Output<String> entityTypeName) {
            $.entityTypeName = entityTypeName;
            return this;
        }

        public Builder entityTypeName(String entityTypeName) {
            return entityTypeName(Output.of(entityTypeName));
        }

        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        public Builder extracts(@Nullable Output<List<KpiExtractArgs>> extracts) {
            $.extracts = extracts;
            return this;
        }

        public Builder extracts(List<KpiExtractArgs> extracts) {
            return extracts(Output.of(extracts));
        }

        public Builder extracts(KpiExtractArgs... extracts) {
            return extracts(List.of(extracts));
        }

        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        public Builder function(Output<KpiFunctions> function) {
            $.function = function;
            return this;
        }

        public Builder function(KpiFunctions function) {
            return function(Output.of(function));
        }

        public Builder groupBy(@Nullable Output<List<String>> groupBy) {
            $.groupBy = groupBy;
            return this;
        }

        public Builder groupBy(List<String> groupBy) {
            return groupBy(Output.of(groupBy));
        }

        public Builder groupBy(String... groupBy) {
            return groupBy(List.of(groupBy));
        }

        public Builder hubName(Output<String> hubName) {
            $.hubName = hubName;
            return this;
        }

        public Builder hubName(String hubName) {
            return hubName(Output.of(hubName));
        }

        public Builder kpiName(@Nullable Output<String> kpiName) {
            $.kpiName = kpiName;
            return this;
        }

        public Builder kpiName(String kpiName) {
            return kpiName(Output.of(kpiName));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder thresHolds(@Nullable Output<KpiThresholdsArgs> thresHolds) {
            $.thresHolds = thresHolds;
            return this;
        }

        public Builder thresHolds(KpiThresholdsArgs thresHolds) {
            return thresHolds(Output.of(thresHolds));
        }

        public Builder unit(@Nullable Output<String> unit) {
            $.unit = unit;
            return this;
        }

        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        public KpiArgs build() {
            $.calculationWindow = Objects.requireNonNull($.calculationWindow, "expected parameter 'calculationWindow' to be non-null");
            $.entityType = Objects.requireNonNull($.entityType, "expected parameter 'entityType' to be non-null");
            $.entityTypeName = Objects.requireNonNull($.entityTypeName, "expected parameter 'entityTypeName' to be non-null");
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            $.function = Objects.requireNonNull($.function, "expected parameter 'function' to be non-null");
            $.hubName = Objects.requireNonNull($.hubName, "expected parameter 'hubName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
