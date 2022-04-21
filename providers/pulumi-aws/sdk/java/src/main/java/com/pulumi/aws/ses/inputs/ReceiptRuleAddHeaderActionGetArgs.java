// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ReceiptRuleAddHeaderActionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReceiptRuleAddHeaderActionGetArgs Empty = new ReceiptRuleAddHeaderActionGetArgs();

    /**
     * The name of the header to add
     * 
     */
    @Import(name="headerName", required=true)
    private Output<String> headerName;

    public Output<String> headerName() {
        return this.headerName;
    }

    /**
     * The value of the header to add
     * 
     */
    @Import(name="headerValue", required=true)
    private Output<String> headerValue;

    public Output<String> headerValue() {
        return this.headerValue;
    }

    /**
     * The position of the action in the receipt rule
     * 
     */
    @Import(name="position", required=true)
    private Output<Integer> position;

    public Output<Integer> position() {
        return this.position;
    }

    private ReceiptRuleAddHeaderActionGetArgs() {}

    private ReceiptRuleAddHeaderActionGetArgs(ReceiptRuleAddHeaderActionGetArgs $) {
        this.headerName = $.headerName;
        this.headerValue = $.headerValue;
        this.position = $.position;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReceiptRuleAddHeaderActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReceiptRuleAddHeaderActionGetArgs $;

        public Builder() {
            $ = new ReceiptRuleAddHeaderActionGetArgs();
        }

        public Builder(ReceiptRuleAddHeaderActionGetArgs defaults) {
            $ = new ReceiptRuleAddHeaderActionGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder headerName(Output<String> headerName) {
            $.headerName = headerName;
            return this;
        }

        public Builder headerName(String headerName) {
            return headerName(Output.of(headerName));
        }

        public Builder headerValue(Output<String> headerValue) {
            $.headerValue = headerValue;
            return this;
        }

        public Builder headerValue(String headerValue) {
            return headerValue(Output.of(headerValue));
        }

        public Builder position(Output<Integer> position) {
            $.position = position;
            return this;
        }

        public Builder position(Integer position) {
            return position(Output.of(position));
        }

        public ReceiptRuleAddHeaderActionGetArgs build() {
            $.headerName = Objects.requireNonNull($.headerName, "expected parameter 'headerName' to be non-null");
            $.headerValue = Objects.requireNonNull($.headerValue, "expected parameter 'headerValue' to be non-null");
            $.position = Objects.requireNonNull($.position, "expected parameter 'position' to be non-null");
            return $;
        }
    }

}
