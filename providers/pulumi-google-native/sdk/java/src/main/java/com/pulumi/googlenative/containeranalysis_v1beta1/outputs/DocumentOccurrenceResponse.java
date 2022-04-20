// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DocumentOccurrenceResponse {
    /**
     * Identify when the SPDX file was originally created. The date is to be specified according to combined date and time in UTC format as specified in ISO 8601 standard
     * 
     */
    private final String createTime;
    /**
     * A field for creators of the SPDX file to provide general comments about the creation of the SPDX file or any other relevant comment not included in the other fields
     * 
     */
    private final String creatorComment;
    /**
     * Identify who (or what, in the case of a tool) created the SPDX file. If the SPDX file was created by an individual, indicate the person&#39;s name
     * 
     */
    private final List<String> creators;
    /**
     * A field for creators of the SPDX file content to provide comments to the consumers of the SPDX document
     * 
     */
    private final String documentComment;
    /**
     * Identify any external SPDX documents referenced within this SPDX document
     * 
     */
    private final List<String> externalDocumentRefs;
    /**
     * A field for creators of the SPDX file to provide the version of the SPDX License List used when the SPDX file was created
     * 
     */
    private final String licenseListVersion;
    /**
     * Provide an SPDX document specific namespace as a unique absolute Uniform Resource Identifier (URI) as specified in RFC-3986, with the exception of the ‘#’ delimiter
     * 
     */
    private final String namespace;
    /**
     * Identify name of this document as designated by creator
     * 
     */
    private final String title;

    @CustomType.Constructor
    private DocumentOccurrenceResponse(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("creatorComment") String creatorComment,
        @CustomType.Parameter("creators") List<String> creators,
        @CustomType.Parameter("documentComment") String documentComment,
        @CustomType.Parameter("externalDocumentRefs") List<String> externalDocumentRefs,
        @CustomType.Parameter("licenseListVersion") String licenseListVersion,
        @CustomType.Parameter("namespace") String namespace,
        @CustomType.Parameter("title") String title) {
        this.createTime = createTime;
        this.creatorComment = creatorComment;
        this.creators = creators;
        this.documentComment = documentComment;
        this.externalDocumentRefs = externalDocumentRefs;
        this.licenseListVersion = licenseListVersion;
        this.namespace = namespace;
        this.title = title;
    }

    /**
     * Identify when the SPDX file was originally created. The date is to be specified according to combined date and time in UTC format as specified in ISO 8601 standard
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * A field for creators of the SPDX file to provide general comments about the creation of the SPDX file or any other relevant comment not included in the other fields
     * 
    */
    public String creatorComment() {
        return this.creatorComment;
    }
    /**
     * Identify who (or what, in the case of a tool) created the SPDX file. If the SPDX file was created by an individual, indicate the person&#39;s name
     * 
    */
    public List<String> creators() {
        return this.creators;
    }
    /**
     * A field for creators of the SPDX file content to provide comments to the consumers of the SPDX document
     * 
    */
    public String documentComment() {
        return this.documentComment;
    }
    /**
     * Identify any external SPDX documents referenced within this SPDX document
     * 
    */
    public List<String> externalDocumentRefs() {
        return this.externalDocumentRefs;
    }
    /**
     * A field for creators of the SPDX file to provide the version of the SPDX License List used when the SPDX file was created
     * 
    */
    public String licenseListVersion() {
        return this.licenseListVersion;
    }
    /**
     * Provide an SPDX document specific namespace as a unique absolute Uniform Resource Identifier (URI) as specified in RFC-3986, with the exception of the ‘#’ delimiter
     * 
    */
    public String namespace() {
        return this.namespace;
    }
    /**
     * Identify name of this document as designated by creator
     * 
    */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String creatorComment;
        private List<String> creators;
        private String documentComment;
        private List<String> externalDocumentRefs;
        private String licenseListVersion;
        private String namespace;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.creatorComment = defaults.creatorComment;
    	      this.creators = defaults.creators;
    	      this.documentComment = defaults.documentComment;
    	      this.externalDocumentRefs = defaults.externalDocumentRefs;
    	      this.licenseListVersion = defaults.licenseListVersion;
    	      this.namespace = defaults.namespace;
    	      this.title = defaults.title;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder creatorComment(String creatorComment) {
            this.creatorComment = Objects.requireNonNull(creatorComment);
            return this;
        }
        public Builder creators(List<String> creators) {
            this.creators = Objects.requireNonNull(creators);
            return this;
        }
        public Builder creators(String... creators) {
            return creators(List.of(creators));
        }
        public Builder documentComment(String documentComment) {
            this.documentComment = Objects.requireNonNull(documentComment);
            return this;
        }
        public Builder externalDocumentRefs(List<String> externalDocumentRefs) {
            this.externalDocumentRefs = Objects.requireNonNull(externalDocumentRefs);
            return this;
        }
        public Builder externalDocumentRefs(String... externalDocumentRefs) {
            return externalDocumentRefs(List.of(externalDocumentRefs));
        }
        public Builder licenseListVersion(String licenseListVersion) {
            this.licenseListVersion = Objects.requireNonNull(licenseListVersion);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public DocumentOccurrenceResponse build() {
            return new DocumentOccurrenceResponse(createTime, creatorComment, creators, documentComment, externalDocumentRefs, licenseListVersion, namespace, title);
        }
    }
}
