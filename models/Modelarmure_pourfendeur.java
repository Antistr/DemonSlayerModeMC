// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelarmure_pourfendeur extends EntityModel<Entity> {
	private final ModelRenderer plastron;
	private final ModelRenderer torse;
	private final ModelRenderer brasdroit;
	private final ModelRenderer brasgauche;
	private final ModelRenderer jambes;
	private final ModelRenderer jambesdroite;
	private final ModelRenderer jambegauche;

	public Modelarmure_pourfendeur() {
		textureWidth = 56;
		textureHeight = 37;

		plastron = new ModelRenderer(this);
		plastron.setRotationPoint(0.0F, 24.0F, 0.0F);

		torse = new ModelRenderer(this);
		torse.setRotationPoint(0.0F, 0.0F, 0.0F);
		plastron.addChild(torse);
		torse.setTextureOffset(0, 0).addBox(-5.0F, -24.0F, -3.0F, 10.0F, 12.0F, 6.0F, 0.0F, false);

		brasdroit = new ModelRenderer(this);
		brasdroit.setRotationPoint(0.0F, 0.0F, 0.0F);
		plastron.addChild(brasdroit);
		brasdroit.setTextureOffset(32, 0).addBox(3.0F, -25.0F, -3.0F, 6.0F, 12.0F, 6.0F, 0.0F, false);

		brasgauche = new ModelRenderer(this);
		brasgauche.setRotationPoint(0.0F, 0.0F, 0.0F);
		plastron.addChild(brasgauche);
		brasgauche.setTextureOffset(32, 0).addBox(-9.0F, -25.0F, -3.0F, 6.0F, 12.0F, 6.0F, 0.0F, false);

		jambes = new ModelRenderer(this);
		jambes.setRotationPoint(0.0F, 24.0F, 0.0F);

		jambesdroite = new ModelRenderer(this);
		jambesdroite.setRotationPoint(0.0F, 0.0F, 0.0F);
		jambes.addChild(jambesdroite);
		jambesdroite.setTextureOffset(0, 18).addBox(-5.0F, -13.0F, -3.0F, 6.0F, 13.0F, 6.0F, 0.0F, false);

		jambegauche = new ModelRenderer(this);
		jambegauche.setRotationPoint(0.0F, 0.0F, 0.0F);
		jambes.addChild(jambegauche);
		jambegauche.setTextureOffset(0, 18).addBox(-1.0F, -13.0F, -3.0F, 6.0F, 13.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		plastron.render(matrixStack, buffer, packedLight, packedOverlay);
		jambes.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}