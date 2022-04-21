// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.enums.ConnectionStringType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Database connection string information.
 * 
 */
public final class ConnStringInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnStringInfoArgs Empty = new ConnStringInfoArgs();

    /**
     * Connection string value.
     * 
     */
    @Import(name="connectionString")
    private @Nullable Output<String> connectionString;

    public Optional<Output<String>> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }

    /**
     * Name of connection string.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Type of database.
     * 
     */
    @Import(name="type")
    private @Nullable Output<ConnectionStringType> type;

    public Optional<Output<ConnectionStringType>> type() {
        return Optional.ofNullable(this.type);
    }

    private ConnStringInfoArgs() {}

    private ConnStringInfoArgs(ConnStringInfoArgs $) {
        this.connectionString = $.connectionString;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnStringInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnStringInfoArgs $;

        public Builder() {
            $ = new ConnStringInfoArgs();
        }

        public Builder(ConnStringInfoArgs defaults) {
            $ = new ConnStringInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder connectionString(@Nullable Output<String> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        public Builder connectionString(String connectionString) {
            return connectionString(Output.of(connectionString));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder type(@Nullable Output<ConnectionStringType> type) {
            $.type = type;
            return this;
        }

        public Builder type(ConnectionStringType type) {
            return type(Output.of(type));
        }

        public ConnStringInfoArgs build() {
            return $;
        }
    }

}
