// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastore.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DataStoreIndexPropertyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataStoreIndexPropertyArgs Empty = new DataStoreIndexPropertyArgs();

    /**
     * The direction the index should optimize for sorting.
     * Possible values are `ASCENDING` and `DESCENDING`.
     * 
     */
    @Import(name="direction", required=true)
    private Output<String> direction;

    public Output<String> direction() {
        return this.direction;
    }

    /**
     * The property name to index.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private DataStoreIndexPropertyArgs() {}

    private DataStoreIndexPropertyArgs(DataStoreIndexPropertyArgs $) {
        this.direction = $.direction;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataStoreIndexPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataStoreIndexPropertyArgs $;

        public Builder() {
            $ = new DataStoreIndexPropertyArgs();
        }

        public Builder(DataStoreIndexPropertyArgs defaults) {
            $ = new DataStoreIndexPropertyArgs(Objects.requireNonNull(defaults));
        }

        public Builder direction(Output<String> direction) {
            $.direction = direction;
            return this;
        }

        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public DataStoreIndexPropertyArgs build() {
            $.direction = Objects.requireNonNull($.direction, "expected parameter 'direction' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
