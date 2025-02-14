// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.PowerQuerySinkResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PowerQuerySinkMappingResponse {
    /**
     * @return List of sinks mapped to Power Query mashup query.
     * 
     */
    private final @Nullable List<PowerQuerySinkResponse> dataflowSinks;
    /**
     * @return Name of the query in Power Query mashup document.
     * 
     */
    private final @Nullable String queryName;

    @CustomType.Constructor
    private PowerQuerySinkMappingResponse(
        @CustomType.Parameter("dataflowSinks") @Nullable List<PowerQuerySinkResponse> dataflowSinks,
        @CustomType.Parameter("queryName") @Nullable String queryName) {
        this.dataflowSinks = dataflowSinks;
        this.queryName = queryName;
    }

    /**
     * @return List of sinks mapped to Power Query mashup query.
     * 
     */
    public List<PowerQuerySinkResponse> dataflowSinks() {
        return this.dataflowSinks == null ? List.of() : this.dataflowSinks;
    }
    /**
     * @return Name of the query in Power Query mashup document.
     * 
     */
    public Optional<String> queryName() {
        return Optional.ofNullable(this.queryName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerQuerySinkMappingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<PowerQuerySinkResponse> dataflowSinks;
        private @Nullable String queryName;

        public Builder() {
    	      // Empty
        }

        public Builder(PowerQuerySinkMappingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataflowSinks = defaults.dataflowSinks;
    	      this.queryName = defaults.queryName;
        }

        public Builder dataflowSinks(@Nullable List<PowerQuerySinkResponse> dataflowSinks) {
            this.dataflowSinks = dataflowSinks;
            return this;
        }
        public Builder dataflowSinks(PowerQuerySinkResponse... dataflowSinks) {
            return dataflowSinks(List.of(dataflowSinks));
        }
        public Builder queryName(@Nullable String queryName) {
            this.queryName = queryName;
            return this;
        }        public PowerQuerySinkMappingResponse build() {
            return new PowerQuerySinkMappingResponse(dataflowSinks, queryName);
        }
    }
}
