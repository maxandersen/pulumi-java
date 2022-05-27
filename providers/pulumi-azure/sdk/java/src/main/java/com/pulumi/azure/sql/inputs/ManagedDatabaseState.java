// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedDatabaseState extends com.pulumi.resources.ResourceArgs {

    public static final ManagedDatabaseState Empty = new ManagedDatabaseState();

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the SQL Managed Instance. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the SQL Managed Instance. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The SQL Managed Instance ID that this Managed Database will be associated with. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="sqlManagedInstanceId")
    private @Nullable Output<String> sqlManagedInstanceId;

    /**
     * @return The SQL Managed Instance ID that this Managed Database will be associated with. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> sqlManagedInstanceId() {
        return Optional.ofNullable(this.sqlManagedInstanceId);
    }

    private ManagedDatabaseState() {}

    private ManagedDatabaseState(ManagedDatabaseState $) {
        this.location = $.location;
        this.name = $.name;
        this.sqlManagedInstanceId = $.sqlManagedInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedDatabaseState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedDatabaseState $;

        public Builder() {
            $ = new ManagedDatabaseState();
        }

        public Builder(ManagedDatabaseState defaults) {
            $ = new ManagedDatabaseState(Objects.requireNonNull(defaults));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the SQL Managed Instance. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the SQL Managed Instance. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sqlManagedInstanceId The SQL Managed Instance ID that this Managed Database will be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sqlManagedInstanceId(@Nullable Output<String> sqlManagedInstanceId) {
            $.sqlManagedInstanceId = sqlManagedInstanceId;
            return this;
        }

        /**
         * @param sqlManagedInstanceId The SQL Managed Instance ID that this Managed Database will be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder sqlManagedInstanceId(String sqlManagedInstanceId) {
            return sqlManagedInstanceId(Output.of(sqlManagedInstanceId));
        }

        public ManagedDatabaseState build() {
            return $;
        }
    }

}
