// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Sql upsert option settings
 * 
 */
public final class SqlUpsertSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final SqlUpsertSettingsResponse Empty = new SqlUpsertSettingsResponse();

    /**
     * Schema name for interim table. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="interimSchemaName")
    private @Nullable Object interimSchemaName;

    public Optional<Object> interimSchemaName() {
        return Optional.ofNullable(this.interimSchemaName);
    }

    /**
     * Key column names for unique row identification. Type: array of strings (or Expression with resultType array of strings).
     * 
     */
    @Import(name="keys")
    private @Nullable Object keys;

    public Optional<Object> keys() {
        return Optional.ofNullable(this.keys);
    }

    /**
     * Specifies whether to use temp db for upsert interim table. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="useTempDB")
    private @Nullable Object useTempDB;

    public Optional<Object> useTempDB() {
        return Optional.ofNullable(this.useTempDB);
    }

    private SqlUpsertSettingsResponse() {}

    private SqlUpsertSettingsResponse(SqlUpsertSettingsResponse $) {
        this.interimSchemaName = $.interimSchemaName;
        this.keys = $.keys;
        this.useTempDB = $.useTempDB;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlUpsertSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlUpsertSettingsResponse $;

        public Builder() {
            $ = new SqlUpsertSettingsResponse();
        }

        public Builder(SqlUpsertSettingsResponse defaults) {
            $ = new SqlUpsertSettingsResponse(Objects.requireNonNull(defaults));
        }

        public Builder interimSchemaName(@Nullable Object interimSchemaName) {
            $.interimSchemaName = interimSchemaName;
            return this;
        }

        public Builder keys(@Nullable Object keys) {
            $.keys = keys;
            return this;
        }

        public Builder useTempDB(@Nullable Object useTempDB) {
            $.useTempDB = useTempDB;
            return this;
        }

        public SqlUpsertSettingsResponse build() {
            return $;
        }
    }

}
