// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cassandra.inputs;

import com.pulumi.awsnative.cassandra.enums.TableMode;
import com.pulumi.awsnative.cassandra.inputs.TableProvisionedThroughput;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableBillingMode extends com.pulumi.resources.InvokeArgs {

    public static final TableBillingMode Empty = new TableBillingMode();

    @Import(name="mode", required=true)
    private TableMode mode;

    public TableMode mode() {
        return this.mode;
    }

    @Import(name="provisionedThroughput")
    private @Nullable TableProvisionedThroughput provisionedThroughput;

    public Optional<TableProvisionedThroughput> provisionedThroughput() {
        return Optional.ofNullable(this.provisionedThroughput);
    }

    private TableBillingMode() {}

    private TableBillingMode(TableBillingMode $) {
        this.mode = $.mode;
        this.provisionedThroughput = $.provisionedThroughput;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableBillingMode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableBillingMode $;

        public Builder() {
            $ = new TableBillingMode();
        }

        public Builder(TableBillingMode defaults) {
            $ = new TableBillingMode(Objects.requireNonNull(defaults));
        }

        public Builder mode(TableMode mode) {
            $.mode = mode;
            return this;
        }

        public Builder provisionedThroughput(@Nullable TableProvisionedThroughput provisionedThroughput) {
            $.provisionedThroughput = provisionedThroughput;
            return this;
        }

        public TableBillingMode build() {
            $.mode = Objects.requireNonNull($.mode, "expected parameter 'mode' to be non-null");
            return $;
        }
    }

}
