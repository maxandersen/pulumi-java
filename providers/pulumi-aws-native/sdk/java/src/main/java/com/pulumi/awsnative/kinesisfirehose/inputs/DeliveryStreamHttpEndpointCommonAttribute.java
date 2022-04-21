// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DeliveryStreamHttpEndpointCommonAttribute extends com.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamHttpEndpointCommonAttribute Empty = new DeliveryStreamHttpEndpointCommonAttribute();

    @Import(name="attributeName", required=true)
    private String attributeName;

    public String attributeName() {
        return this.attributeName;
    }

    @Import(name="attributeValue", required=true)
    private String attributeValue;

    public String attributeValue() {
        return this.attributeValue;
    }

    private DeliveryStreamHttpEndpointCommonAttribute() {}

    private DeliveryStreamHttpEndpointCommonAttribute(DeliveryStreamHttpEndpointCommonAttribute $) {
        this.attributeName = $.attributeName;
        this.attributeValue = $.attributeValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryStreamHttpEndpointCommonAttribute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryStreamHttpEndpointCommonAttribute $;

        public Builder() {
            $ = new DeliveryStreamHttpEndpointCommonAttribute();
        }

        public Builder(DeliveryStreamHttpEndpointCommonAttribute defaults) {
            $ = new DeliveryStreamHttpEndpointCommonAttribute(Objects.requireNonNull(defaults));
        }

        public Builder attributeName(String attributeName) {
            $.attributeName = attributeName;
            return this;
        }

        public Builder attributeValue(String attributeValue) {
            $.attributeValue = attributeValue;
            return this;
        }

        public DeliveryStreamHttpEndpointCommonAttribute build() {
            $.attributeName = Objects.requireNonNull($.attributeName, "expected parameter 'attributeName' to be non-null");
            $.attributeValue = Objects.requireNonNull($.attributeValue, "expected parameter 'attributeValue' to be non-null");
            return $;
        }
    }

}
