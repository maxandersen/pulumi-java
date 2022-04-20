// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.AttestationResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.BuildDetailsResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.ComplianceOccurrenceResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DSSEAttestationOccurrenceResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DeploymentResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DerivedResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DiscoveredResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.DocumentOccurrenceResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.EnvelopeResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.FileOccurrenceResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.InstallationResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.PackageInfoOccurrenceResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.RelationshipOccurrenceResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.ResourceResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.UpgradeOccurrenceResponse;
import com.pulumi.googlenative.containeranalysis_v1alpha1.outputs.VulnerabilityDetailsResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetOccurrenceResult {
    /**
     * Describes an attestation of an artifact.
     * 
     */
    private final AttestationResponse attestation;
    /**
     * Build details for a verifiable build.
     * 
     */
    private final BuildDetailsResponse buildDetails;
    /**
     * Describes whether or not a resource passes compliance checks.
     * 
     */
    private final ComplianceOccurrenceResponse compliance;
    /**
     * The time this `Occurrence` was created.
     * 
     */
    private final String createTime;
    /**
     * Describes the deployment of an artifact on a runtime.
     * 
     */
    private final DeploymentResponse deployment;
    /**
     * Describes how this resource derives from the basis in the associated note.
     * 
     */
    private final DerivedResponse derivedImage;
    /**
     * Describes the initial scan status for this resource.
     * 
     */
    private final DiscoveredResponse discovered;
    /**
     * This represents a DSSE attestation occurrence
     * 
     */
    private final DSSEAttestationOccurrenceResponse dsseAttestation;
    /**
     * https://github.com/secure-systems-lab/dsse
     * 
     */
    private final EnvelopeResponse envelope;
    /**
     * Describes the installation of a package on the linked resource.
     * 
     */
    private final InstallationResponse installation;
    /**
     * This explicitly denotes which of the `Occurrence` details are specified. This field can be used as a filter in list requests.
     * 
     */
    private final String kind;
    /**
     * The name of the `Occurrence` in the form &#34;projects/{project_id}/occurrences/{OCCURRENCE_ID}&#34;
     * 
     */
    private final String name;
    /**
     * An analysis note associated with this image, in the form &#34;providers/{provider_id}/notes/{NOTE_ID}&#34; This field can be used as a filter in list requests.
     * 
     */
    private final String noteName;
    /**
     * A description of actions that can be taken to remedy the `Note`
     * 
     */
    private final String remediation;
    /**
     *  The resource for which the `Occurrence` applies.
     * 
     */
    private final ResourceResponse resource;
    /**
     * The unique URL of the image or the container for which the `Occurrence` applies. For example, https://gcr.io/project/image@sha256:foo This field can be used as a filter in list requests.
     * 
     */
    private final String resourceUrl;
    /**
     * Describes a specific software bill of materials document.
     * 
     */
    private final DocumentOccurrenceResponse sbom;
    /**
     * Describes a specific SPDX File.
     * 
     */
    private final FileOccurrenceResponse spdxFile;
    /**
     * Describes a specific SPDX Package.
     * 
     */
    private final PackageInfoOccurrenceResponse spdxPackage;
    /**
     * Describes a specific relationship between SPDX elements.
     * 
     */
    private final RelationshipOccurrenceResponse spdxRelationship;
    /**
     * The time this `Occurrence` was last updated.
     * 
     */
    private final String updateTime;
    /**
     * Describes an upgrade.
     * 
     */
    private final UpgradeOccurrenceResponse upgrade;
    /**
     * Details of a security vulnerability note.
     * 
     */
    private final VulnerabilityDetailsResponse vulnerabilityDetails;

    @CustomType.Constructor
    private GetOccurrenceResult(
        @CustomType.Parameter("attestation") AttestationResponse attestation,
        @CustomType.Parameter("buildDetails") BuildDetailsResponse buildDetails,
        @CustomType.Parameter("compliance") ComplianceOccurrenceResponse compliance,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("deployment") DeploymentResponse deployment,
        @CustomType.Parameter("derivedImage") DerivedResponse derivedImage,
        @CustomType.Parameter("discovered") DiscoveredResponse discovered,
        @CustomType.Parameter("dsseAttestation") DSSEAttestationOccurrenceResponse dsseAttestation,
        @CustomType.Parameter("envelope") EnvelopeResponse envelope,
        @CustomType.Parameter("installation") InstallationResponse installation,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("noteName") String noteName,
        @CustomType.Parameter("remediation") String remediation,
        @CustomType.Parameter("resource") ResourceResponse resource,
        @CustomType.Parameter("resourceUrl") String resourceUrl,
        @CustomType.Parameter("sbom") DocumentOccurrenceResponse sbom,
        @CustomType.Parameter("spdxFile") FileOccurrenceResponse spdxFile,
        @CustomType.Parameter("spdxPackage") PackageInfoOccurrenceResponse spdxPackage,
        @CustomType.Parameter("spdxRelationship") RelationshipOccurrenceResponse spdxRelationship,
        @CustomType.Parameter("updateTime") String updateTime,
        @CustomType.Parameter("upgrade") UpgradeOccurrenceResponse upgrade,
        @CustomType.Parameter("vulnerabilityDetails") VulnerabilityDetailsResponse vulnerabilityDetails) {
        this.attestation = attestation;
        this.buildDetails = buildDetails;
        this.compliance = compliance;
        this.createTime = createTime;
        this.deployment = deployment;
        this.derivedImage = derivedImage;
        this.discovered = discovered;
        this.dsseAttestation = dsseAttestation;
        this.envelope = envelope;
        this.installation = installation;
        this.kind = kind;
        this.name = name;
        this.noteName = noteName;
        this.remediation = remediation;
        this.resource = resource;
        this.resourceUrl = resourceUrl;
        this.sbom = sbom;
        this.spdxFile = spdxFile;
        this.spdxPackage = spdxPackage;
        this.spdxRelationship = spdxRelationship;
        this.updateTime = updateTime;
        this.upgrade = upgrade;
        this.vulnerabilityDetails = vulnerabilityDetails;
    }

    /**
     * Describes an attestation of an artifact.
     * 
    */
    public AttestationResponse attestation() {
        return this.attestation;
    }
    /**
     * Build details for a verifiable build.
     * 
    */
    public BuildDetailsResponse buildDetails() {
        return this.buildDetails;
    }
    /**
     * Describes whether or not a resource passes compliance checks.
     * 
    */
    public ComplianceOccurrenceResponse compliance() {
        return this.compliance;
    }
    /**
     * The time this `Occurrence` was created.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * Describes the deployment of an artifact on a runtime.
     * 
    */
    public DeploymentResponse deployment() {
        return this.deployment;
    }
    /**
     * Describes how this resource derives from the basis in the associated note.
     * 
    */
    public DerivedResponse derivedImage() {
        return this.derivedImage;
    }
    /**
     * Describes the initial scan status for this resource.
     * 
    */
    public DiscoveredResponse discovered() {
        return this.discovered;
    }
    /**
     * This represents a DSSE attestation occurrence
     * 
    */
    public DSSEAttestationOccurrenceResponse dsseAttestation() {
        return this.dsseAttestation;
    }
    /**
     * https://github.com/secure-systems-lab/dsse
     * 
    */
    public EnvelopeResponse envelope() {
        return this.envelope;
    }
    /**
     * Describes the installation of a package on the linked resource.
     * 
    */
    public InstallationResponse installation() {
        return this.installation;
    }
    /**
     * This explicitly denotes which of the `Occurrence` details are specified. This field can be used as a filter in list requests.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * The name of the `Occurrence` in the form &#34;projects/{project_id}/occurrences/{OCCURRENCE_ID}&#34;
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * An analysis note associated with this image, in the form &#34;providers/{provider_id}/notes/{NOTE_ID}&#34; This field can be used as a filter in list requests.
     * 
    */
    public String noteName() {
        return this.noteName;
    }
    /**
     * A description of actions that can be taken to remedy the `Note`
     * 
    */
    public String remediation() {
        return this.remediation;
    }
    /**
     *  The resource for which the `Occurrence` applies.
     * 
    */
    public ResourceResponse resource() {
        return this.resource;
    }
    /**
     * The unique URL of the image or the container for which the `Occurrence` applies. For example, https://gcr.io/project/image@sha256:foo This field can be used as a filter in list requests.
     * 
    */
    public String resourceUrl() {
        return this.resourceUrl;
    }
    /**
     * Describes a specific software bill of materials document.
     * 
    */
    public DocumentOccurrenceResponse sbom() {
        return this.sbom;
    }
    /**
     * Describes a specific SPDX File.
     * 
    */
    public FileOccurrenceResponse spdxFile() {
        return this.spdxFile;
    }
    /**
     * Describes a specific SPDX Package.
     * 
    */
    public PackageInfoOccurrenceResponse spdxPackage() {
        return this.spdxPackage;
    }
    /**
     * Describes a specific relationship between SPDX elements.
     * 
    */
    public RelationshipOccurrenceResponse spdxRelationship() {
        return this.spdxRelationship;
    }
    /**
     * The time this `Occurrence` was last updated.
     * 
    */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * Describes an upgrade.
     * 
    */
    public UpgradeOccurrenceResponse upgrade() {
        return this.upgrade;
    }
    /**
     * Details of a security vulnerability note.
     * 
    */
    public VulnerabilityDetailsResponse vulnerabilityDetails() {
        return this.vulnerabilityDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOccurrenceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttestationResponse attestation;
        private BuildDetailsResponse buildDetails;
        private ComplianceOccurrenceResponse compliance;
        private String createTime;
        private DeploymentResponse deployment;
        private DerivedResponse derivedImage;
        private DiscoveredResponse discovered;
        private DSSEAttestationOccurrenceResponse dsseAttestation;
        private EnvelopeResponse envelope;
        private InstallationResponse installation;
        private String kind;
        private String name;
        private String noteName;
        private String remediation;
        private ResourceResponse resource;
        private String resourceUrl;
        private DocumentOccurrenceResponse sbom;
        private FileOccurrenceResponse spdxFile;
        private PackageInfoOccurrenceResponse spdxPackage;
        private RelationshipOccurrenceResponse spdxRelationship;
        private String updateTime;
        private UpgradeOccurrenceResponse upgrade;
        private VulnerabilityDetailsResponse vulnerabilityDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOccurrenceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestation = defaults.attestation;
    	      this.buildDetails = defaults.buildDetails;
    	      this.compliance = defaults.compliance;
    	      this.createTime = defaults.createTime;
    	      this.deployment = defaults.deployment;
    	      this.derivedImage = defaults.derivedImage;
    	      this.discovered = defaults.discovered;
    	      this.dsseAttestation = defaults.dsseAttestation;
    	      this.envelope = defaults.envelope;
    	      this.installation = defaults.installation;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.noteName = defaults.noteName;
    	      this.remediation = defaults.remediation;
    	      this.resource = defaults.resource;
    	      this.resourceUrl = defaults.resourceUrl;
    	      this.sbom = defaults.sbom;
    	      this.spdxFile = defaults.spdxFile;
    	      this.spdxPackage = defaults.spdxPackage;
    	      this.spdxRelationship = defaults.spdxRelationship;
    	      this.updateTime = defaults.updateTime;
    	      this.upgrade = defaults.upgrade;
    	      this.vulnerabilityDetails = defaults.vulnerabilityDetails;
        }

        public Builder attestation(AttestationResponse attestation) {
            this.attestation = Objects.requireNonNull(attestation);
            return this;
        }
        public Builder buildDetails(BuildDetailsResponse buildDetails) {
            this.buildDetails = Objects.requireNonNull(buildDetails);
            return this;
        }
        public Builder compliance(ComplianceOccurrenceResponse compliance) {
            this.compliance = Objects.requireNonNull(compliance);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder deployment(DeploymentResponse deployment) {
            this.deployment = Objects.requireNonNull(deployment);
            return this;
        }
        public Builder derivedImage(DerivedResponse derivedImage) {
            this.derivedImage = Objects.requireNonNull(derivedImage);
            return this;
        }
        public Builder discovered(DiscoveredResponse discovered) {
            this.discovered = Objects.requireNonNull(discovered);
            return this;
        }
        public Builder dsseAttestation(DSSEAttestationOccurrenceResponse dsseAttestation) {
            this.dsseAttestation = Objects.requireNonNull(dsseAttestation);
            return this;
        }
        public Builder envelope(EnvelopeResponse envelope) {
            this.envelope = Objects.requireNonNull(envelope);
            return this;
        }
        public Builder installation(InstallationResponse installation) {
            this.installation = Objects.requireNonNull(installation);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder noteName(String noteName) {
            this.noteName = Objects.requireNonNull(noteName);
            return this;
        }
        public Builder remediation(String remediation) {
            this.remediation = Objects.requireNonNull(remediation);
            return this;
        }
        public Builder resource(ResourceResponse resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }
        public Builder resourceUrl(String resourceUrl) {
            this.resourceUrl = Objects.requireNonNull(resourceUrl);
            return this;
        }
        public Builder sbom(DocumentOccurrenceResponse sbom) {
            this.sbom = Objects.requireNonNull(sbom);
            return this;
        }
        public Builder spdxFile(FileOccurrenceResponse spdxFile) {
            this.spdxFile = Objects.requireNonNull(spdxFile);
            return this;
        }
        public Builder spdxPackage(PackageInfoOccurrenceResponse spdxPackage) {
            this.spdxPackage = Objects.requireNonNull(spdxPackage);
            return this;
        }
        public Builder spdxRelationship(RelationshipOccurrenceResponse spdxRelationship) {
            this.spdxRelationship = Objects.requireNonNull(spdxRelationship);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public Builder upgrade(UpgradeOccurrenceResponse upgrade) {
            this.upgrade = Objects.requireNonNull(upgrade);
            return this;
        }
        public Builder vulnerabilityDetails(VulnerabilityDetailsResponse vulnerabilityDetails) {
            this.vulnerabilityDetails = Objects.requireNonNull(vulnerabilityDetails);
            return this;
        }        public GetOccurrenceResult build() {
            return new GetOccurrenceResult(attestation, buildDetails, compliance, createTime, deployment, derivedImage, discovered, dsseAttestation, envelope, installation, kind, name, noteName, remediation, resource, resourceUrl, sbom, spdxFile, spdxPackage, spdxRelationship, updateTime, upgrade, vulnerabilityDetails);
        }
    }
}
