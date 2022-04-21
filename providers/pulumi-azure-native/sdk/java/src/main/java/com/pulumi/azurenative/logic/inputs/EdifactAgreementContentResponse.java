// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.inputs.EdifactOneWayAgreementResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The Edifact agreement content.
 * 
 */
public final class EdifactAgreementContentResponse extends com.pulumi.resources.InvokeArgs {

    public static final EdifactAgreementContentResponse Empty = new EdifactAgreementContentResponse();

    /**
     * The EDIFACT one-way receive agreement.
     * 
     */
    @Import(name="receiveAgreement", required=true)
    private EdifactOneWayAgreementResponse receiveAgreement;

    public EdifactOneWayAgreementResponse receiveAgreement() {
        return this.receiveAgreement;
    }

    /**
     * The EDIFACT one-way send agreement.
     * 
     */
    @Import(name="sendAgreement", required=true)
    private EdifactOneWayAgreementResponse sendAgreement;

    public EdifactOneWayAgreementResponse sendAgreement() {
        return this.sendAgreement;
    }

    private EdifactAgreementContentResponse() {}

    private EdifactAgreementContentResponse(EdifactAgreementContentResponse $) {
        this.receiveAgreement = $.receiveAgreement;
        this.sendAgreement = $.sendAgreement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdifactAgreementContentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdifactAgreementContentResponse $;

        public Builder() {
            $ = new EdifactAgreementContentResponse();
        }

        public Builder(EdifactAgreementContentResponse defaults) {
            $ = new EdifactAgreementContentResponse(Objects.requireNonNull(defaults));
        }

        public Builder receiveAgreement(EdifactOneWayAgreementResponse receiveAgreement) {
            $.receiveAgreement = receiveAgreement;
            return this;
        }

        public Builder sendAgreement(EdifactOneWayAgreementResponse sendAgreement) {
            $.sendAgreement = sendAgreement;
            return this;
        }

        public EdifactAgreementContentResponse build() {
            $.receiveAgreement = Objects.requireNonNull($.receiveAgreement, "expected parameter 'receiveAgreement' to be non-null");
            $.sendAgreement = Objects.requireNonNull($.sendAgreement, "expected parameter 'sendAgreement' to be non-null");
            return $;
        }
    }

}
