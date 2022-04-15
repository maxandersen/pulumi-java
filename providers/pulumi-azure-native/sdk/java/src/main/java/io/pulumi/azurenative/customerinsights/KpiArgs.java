// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights;

import io.pulumi.azurenative.customerinsights.enums.CalculationWindowTypes;
import io.pulumi.azurenative.customerinsights.enums.EntityTypes;
import io.pulumi.azurenative.customerinsights.enums.KpiFunctions;
import io.pulumi.azurenative.customerinsights.inputs.KpiAliasArgs;
import io.pulumi.azurenative.customerinsights.inputs.KpiExtractArgs;
import io.pulumi.azurenative.customerinsights.inputs.KpiThresholdsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KpiArgs extends io.pulumi.resources.ResourceArgs {

    public static final KpiArgs Empty = new KpiArgs();

    /**
     * The aliases.
     * 
     */
    @Import(name="aliases")
      private final @Nullable Output<List<KpiAliasArgs>> aliases;

    public Output<List<KpiAliasArgs>> aliases() {
        return this.aliases == null ? Codegen.empty() : this.aliases;
    }

    /**
     * The calculation window.
     * 
     */
    @Import(name="calculationWindow", required=true)
      private final Output<CalculationWindowTypes> calculationWindow;

    public Output<CalculationWindowTypes> calculationWindow() {
        return this.calculationWindow;
    }

    /**
     * Name of calculation window field.
     * 
     */
    @Import(name="calculationWindowFieldName")
      private final @Nullable Output<String> calculationWindowFieldName;

    public Output<String> calculationWindowFieldName() {
        return this.calculationWindowFieldName == null ? Codegen.empty() : this.calculationWindowFieldName;
    }

    /**
     * Localized description for the KPI.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<Map<String,String>> description;

    public Output<Map<String,String>> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Localized display name for the KPI.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<Map<String,String>> displayName;

    public Output<Map<String,String>> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The mapping entity type.
     * 
     */
    @Import(name="entityType", required=true)
      private final Output<EntityTypes> entityType;

    public Output<EntityTypes> entityType() {
        return this.entityType;
    }

    /**
     * The mapping entity name.
     * 
     */
    @Import(name="entityTypeName", required=true)
      private final Output<String> entityTypeName;

    public Output<String> entityTypeName() {
        return this.entityTypeName;
    }

    /**
     * The computation expression for the KPI.
     * 
     */
    @Import(name="expression", required=true)
      private final Output<String> expression;

    public Output<String> expression() {
        return this.expression;
    }

    /**
     * The KPI extracts.
     * 
     */
    @Import(name="extracts")
      private final @Nullable Output<List<KpiExtractArgs>> extracts;

    public Output<List<KpiExtractArgs>> extracts() {
        return this.extracts == null ? Codegen.empty() : this.extracts;
    }

    /**
     * The filter expression for the KPI.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<String> filter;

    public Output<String> filter() {
        return this.filter == null ? Codegen.empty() : this.filter;
    }

    /**
     * The computation function for the KPI.
     * 
     */
    @Import(name="function", required=true)
      private final Output<KpiFunctions> function;

    public Output<KpiFunctions> function() {
        return this.function;
    }

    /**
     * the group by properties for the KPI.
     * 
     */
    @Import(name="groupBy")
      private final @Nullable Output<List<String>> groupBy;

    public Output<List<String>> groupBy() {
        return this.groupBy == null ? Codegen.empty() : this.groupBy;
    }

    /**
     * The name of the hub.
     * 
     */
    @Import(name="hubName", required=true)
      private final Output<String> hubName;

    public Output<String> hubName() {
        return this.hubName;
    }

    /**
     * The name of the KPI.
     * 
     */
    @Import(name="kpiName")
      private final @Nullable Output<String> kpiName;

    public Output<String> kpiName() {
        return this.kpiName == null ? Codegen.empty() : this.kpiName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The KPI thresholds.
     * 
     */
    @Import(name="thresHolds")
      private final @Nullable Output<KpiThresholdsArgs> thresHolds;

    public Output<KpiThresholdsArgs> thresHolds() {
        return this.thresHolds == null ? Codegen.empty() : this.thresHolds;
    }

    /**
     * The unit of measurement for the KPI.
     * 
     */
    @Import(name="unit")
      private final @Nullable Output<String> unit;

    public Output<String> unit() {
        return this.unit == null ? Codegen.empty() : this.unit;
    }

    public KpiArgs(
        @Nullable Output<List<KpiAliasArgs>> aliases,
        Output<CalculationWindowTypes> calculationWindow,
        @Nullable Output<String> calculationWindowFieldName,
        @Nullable Output<Map<String,String>> description,
        @Nullable Output<Map<String,String>> displayName,
        Output<EntityTypes> entityType,
        Output<String> entityTypeName,
        Output<String> expression,
        @Nullable Output<List<KpiExtractArgs>> extracts,
        @Nullable Output<String> filter,
        Output<KpiFunctions> function,
        @Nullable Output<List<String>> groupBy,
        Output<String> hubName,
        @Nullable Output<String> kpiName,
        Output<String> resourceGroupName,
        @Nullable Output<KpiThresholdsArgs> thresHolds,
        @Nullable Output<String> unit) {
        this.aliases = aliases;
        this.calculationWindow = Objects.requireNonNull(calculationWindow, "expected parameter 'calculationWindow' to be non-null");
        this.calculationWindowFieldName = calculationWindowFieldName;
        this.description = description;
        this.displayName = displayName;
        this.entityType = Objects.requireNonNull(entityType, "expected parameter 'entityType' to be non-null");
        this.entityTypeName = Objects.requireNonNull(entityTypeName, "expected parameter 'entityTypeName' to be non-null");
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
        this.extracts = extracts;
        this.filter = filter;
        this.function = Objects.requireNonNull(function, "expected parameter 'function' to be non-null");
        this.groupBy = groupBy;
        this.hubName = Objects.requireNonNull(hubName, "expected parameter 'hubName' to be non-null");
        this.kpiName = kpiName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.thresHolds = thresHolds;
        this.unit = unit;
    }

    private KpiArgs() {
        this.aliases = Codegen.empty();
        this.calculationWindow = Codegen.empty();
        this.calculationWindowFieldName = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.entityType = Codegen.empty();
        this.entityTypeName = Codegen.empty();
        this.expression = Codegen.empty();
        this.extracts = Codegen.empty();
        this.filter = Codegen.empty();
        this.function = Codegen.empty();
        this.groupBy = Codegen.empty();
        this.hubName = Codegen.empty();
        this.kpiName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.thresHolds = Codegen.empty();
        this.unit = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KpiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<KpiAliasArgs>> aliases;
        private Output<CalculationWindowTypes> calculationWindow;
        private @Nullable Output<String> calculationWindowFieldName;
        private @Nullable Output<Map<String,String>> description;
        private @Nullable Output<Map<String,String>> displayName;
        private Output<EntityTypes> entityType;
        private Output<String> entityTypeName;
        private Output<String> expression;
        private @Nullable Output<List<KpiExtractArgs>> extracts;
        private @Nullable Output<String> filter;
        private Output<KpiFunctions> function;
        private @Nullable Output<List<String>> groupBy;
        private Output<String> hubName;
        private @Nullable Output<String> kpiName;
        private Output<String> resourceGroupName;
        private @Nullable Output<KpiThresholdsArgs> thresHolds;
        private @Nullable Output<String> unit;

        public Builder() {
    	      // Empty
        }

        public Builder(KpiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliases = defaults.aliases;
    	      this.calculationWindow = defaults.calculationWindow;
    	      this.calculationWindowFieldName = defaults.calculationWindowFieldName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.entityType = defaults.entityType;
    	      this.entityTypeName = defaults.entityTypeName;
    	      this.expression = defaults.expression;
    	      this.extracts = defaults.extracts;
    	      this.filter = defaults.filter;
    	      this.function = defaults.function;
    	      this.groupBy = defaults.groupBy;
    	      this.hubName = defaults.hubName;
    	      this.kpiName = defaults.kpiName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.thresHolds = defaults.thresHolds;
    	      this.unit = defaults.unit;
        }

        public Builder aliases(@Nullable Output<List<KpiAliasArgs>> aliases) {
            this.aliases = aliases;
            return this;
        }
        public Builder aliases(@Nullable List<KpiAliasArgs> aliases) {
            this.aliases = Codegen.ofNullable(aliases);
            return this;
        }
        public Builder aliases(KpiAliasArgs... aliases) {
            return aliases(List.of(aliases));
        }
        public Builder calculationWindow(Output<CalculationWindowTypes> calculationWindow) {
            this.calculationWindow = Objects.requireNonNull(calculationWindow);
            return this;
        }
        public Builder calculationWindow(CalculationWindowTypes calculationWindow) {
            this.calculationWindow = Output.of(Objects.requireNonNull(calculationWindow));
            return this;
        }
        public Builder calculationWindowFieldName(@Nullable Output<String> calculationWindowFieldName) {
            this.calculationWindowFieldName = calculationWindowFieldName;
            return this;
        }
        public Builder calculationWindowFieldName(@Nullable String calculationWindowFieldName) {
            this.calculationWindowFieldName = Codegen.ofNullable(calculationWindowFieldName);
            return this;
        }
        public Builder description(@Nullable Output<Map<String,String>> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable Map<String,String> description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<Map<String,String>> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable Map<String,String> displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder entityType(Output<EntityTypes> entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }
        public Builder entityType(EntityTypes entityType) {
            this.entityType = Output.of(Objects.requireNonNull(entityType));
            return this;
        }
        public Builder entityTypeName(Output<String> entityTypeName) {
            this.entityTypeName = Objects.requireNonNull(entityTypeName);
            return this;
        }
        public Builder entityTypeName(String entityTypeName) {
            this.entityTypeName = Output.of(Objects.requireNonNull(entityTypeName));
            return this;
        }
        public Builder expression(Output<String> expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        public Builder expression(String expression) {
            this.expression = Output.of(Objects.requireNonNull(expression));
            return this;
        }
        public Builder extracts(@Nullable Output<List<KpiExtractArgs>> extracts) {
            this.extracts = extracts;
            return this;
        }
        public Builder extracts(@Nullable List<KpiExtractArgs> extracts) {
            this.extracts = Codegen.ofNullable(extracts);
            return this;
        }
        public Builder extracts(KpiExtractArgs... extracts) {
            return extracts(List.of(extracts));
        }
        public Builder filter(@Nullable Output<String> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable String filter) {
            this.filter = Codegen.ofNullable(filter);
            return this;
        }
        public Builder function(Output<KpiFunctions> function) {
            this.function = Objects.requireNonNull(function);
            return this;
        }
        public Builder function(KpiFunctions function) {
            this.function = Output.of(Objects.requireNonNull(function));
            return this;
        }
        public Builder groupBy(@Nullable Output<List<String>> groupBy) {
            this.groupBy = groupBy;
            return this;
        }
        public Builder groupBy(@Nullable List<String> groupBy) {
            this.groupBy = Codegen.ofNullable(groupBy);
            return this;
        }
        public Builder groupBy(String... groupBy) {
            return groupBy(List.of(groupBy));
        }
        public Builder hubName(Output<String> hubName) {
            this.hubName = Objects.requireNonNull(hubName);
            return this;
        }
        public Builder hubName(String hubName) {
            this.hubName = Output.of(Objects.requireNonNull(hubName));
            return this;
        }
        public Builder kpiName(@Nullable Output<String> kpiName) {
            this.kpiName = kpiName;
            return this;
        }
        public Builder kpiName(@Nullable String kpiName) {
            this.kpiName = Codegen.ofNullable(kpiName);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder thresHolds(@Nullable Output<KpiThresholdsArgs> thresHolds) {
            this.thresHolds = thresHolds;
            return this;
        }
        public Builder thresHolds(@Nullable KpiThresholdsArgs thresHolds) {
            this.thresHolds = Codegen.ofNullable(thresHolds);
            return this;
        }
        public Builder unit(@Nullable Output<String> unit) {
            this.unit = unit;
            return this;
        }
        public Builder unit(@Nullable String unit) {
            this.unit = Codegen.ofNullable(unit);
            return this;
        }        public KpiArgs build() {
            return new KpiArgs(aliases, calculationWindow, calculationWindowFieldName, description, displayName, entityType, entityTypeName, expression, extracts, filter, function, groupBy, hubName, kpiName, resourceGroupName, thresHolds, unit);
        }
    }
}
