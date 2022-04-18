// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Informational metadata about Partner attachments from Partners to display to customers. These fields are propagated from PARTNER_PROVIDER attachments to their corresponding PARTNER attachments.
 * 
 */
public final class InterconnectAttachmentPartnerMetadataResponse extends com.pulumi.resources.InvokeArgs {

    public static final InterconnectAttachmentPartnerMetadataResponse Empty = new InterconnectAttachmentPartnerMetadataResponse();

    /**
     * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved Partner values.
     * 
     */
    @Import(name="interconnectName", required=true)
      private final String interconnectName;

    public String interconnectName() {
        return this.interconnectName;
    }

    /**
     * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
     * 
     */
    @Import(name="partnerName", required=true)
      private final String partnerName;

    public String partnerName() {
        return this.partnerName;
    }

    /**
     * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
     * 
     */
    @Import(name="portalUrl", required=true)
      private final String portalUrl;

    public String portalUrl() {
        return this.portalUrl;
    }

    public InterconnectAttachmentPartnerMetadataResponse(
        String interconnectName,
        String partnerName,
        String portalUrl) {
        this.interconnectName = Objects.requireNonNull(interconnectName, "expected parameter 'interconnectName' to be non-null");
        this.partnerName = Objects.requireNonNull(partnerName, "expected parameter 'partnerName' to be non-null");
        this.portalUrl = Objects.requireNonNull(portalUrl, "expected parameter 'portalUrl' to be non-null");
    }

    private InterconnectAttachmentPartnerMetadataResponse() {
        this.interconnectName = null;
        this.partnerName = null;
        this.portalUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InterconnectAttachmentPartnerMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String interconnectName;
        private String partnerName;
        private String portalUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(InterconnectAttachmentPartnerMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interconnectName = defaults.interconnectName;
    	      this.partnerName = defaults.partnerName;
    	      this.portalUrl = defaults.portalUrl;
        }

        public Builder interconnectName(String interconnectName) {
            this.interconnectName = Objects.requireNonNull(interconnectName);
            return this;
        }
        public Builder partnerName(String partnerName) {
            this.partnerName = Objects.requireNonNull(partnerName);
            return this;
        }
        public Builder portalUrl(String portalUrl) {
            this.portalUrl = Objects.requireNonNull(portalUrl);
            return this;
        }        public InterconnectAttachmentPartnerMetadataResponse build() {
            return new InterconnectAttachmentPartnerMetadataResponse(interconnectName, partnerName, portalUrl);
        }
    }
}
