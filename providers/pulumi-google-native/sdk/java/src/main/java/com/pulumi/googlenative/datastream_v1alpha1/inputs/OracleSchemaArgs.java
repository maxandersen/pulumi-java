// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datastream_v1alpha1.inputs.OracleTableArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Oracle schema.
 * 
 */
public final class OracleSchemaArgs extends com.pulumi.resources.ResourceArgs {

    public static final OracleSchemaArgs Empty = new OracleSchemaArgs();

    /**
     * Tables in the schema.
     * 
     */
    @Import(name="oracleTables")
    private @Nullable Output<List<OracleTableArgs>> oracleTables;

    public Optional<Output<List<OracleTableArgs>>> oracleTables() {
        return Optional.ofNullable(this.oracleTables);
    }

    /**
     * Schema name.
     * 
     */
    @Import(name="schemaName")
    private @Nullable Output<String> schemaName;

    public Optional<Output<String>> schemaName() {
        return Optional.ofNullable(this.schemaName);
    }

    private OracleSchemaArgs() {}

    private OracleSchemaArgs(OracleSchemaArgs $) {
        this.oracleTables = $.oracleTables;
        this.schemaName = $.schemaName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OracleSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OracleSchemaArgs $;

        public Builder() {
            $ = new OracleSchemaArgs();
        }

        public Builder(OracleSchemaArgs defaults) {
            $ = new OracleSchemaArgs(Objects.requireNonNull(defaults));
        }

        public Builder oracleTables(@Nullable Output<List<OracleTableArgs>> oracleTables) {
            $.oracleTables = oracleTables;
            return this;
        }

        public Builder oracleTables(List<OracleTableArgs> oracleTables) {
            return oracleTables(Output.of(oracleTables));
        }

        public Builder oracleTables(OracleTableArgs... oracleTables) {
            return oracleTables(List.of(oracleTables));
        }

        public Builder schemaName(@Nullable Output<String> schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        public Builder schemaName(String schemaName) {
            return schemaName(Output.of(schemaName));
        }

        public OracleSchemaArgs build() {
            return $;
        }
    }

}
